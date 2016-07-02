package com.farrukhworkstation.demoapplication.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farrukhworkstation.demoapplication.DemoApplication;
import com.farrukhworkstation.demoapplication.R;
import com.farrukhworkstation.demoapplication.Utilities.Constants;
import com.farrukhworkstation.demoapplication.Utilities.DividerItemDecoration;
import com.farrukhworkstation.demoapplication.adapters.RecyclerAdapter;
import com.farrukhworkstation.demoapplication.databases.DataManipulation;
import com.farrukhworkstation.demoapplication.networkInterfaces.MyNetworkInterface;
import com.farrukhworkstation.demoapplication.models.Hit;
import com.farrukhworkstation.demoapplication.models.ImageModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class HomeFragment extends Fragment {
    @BindView(R.id.recycler_view)
    RecyclerView RV;
    View mainView;
    private Unbinder unbinder;

    @Inject
    MyNetworkInterface myNetworkInterface;

    @Inject
    Constants mConstants;

    @Inject
    DataManipulation dataManipulation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.home_fragment, container, false);
        unbinder = ButterKnife.bind(this, mainView);
        ((DemoApplication) getActivity().getApplication()).getmyNetworkRequestComponent().inject(this);
        getData();
        return mainView;
    }

    private void getData() {
        Call<ImageModel> call = myNetworkInterface.getFlowers(mConstants.RequestApiKey, "yellow-flowers", "photo");
        call.enqueue(new Callback<ImageModel>() {
            @Override
            public void onResponse(Response<ImageModel> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    dataManipulation.saveData(response.body().getHits());
                    setData(dataManipulation.getData());
                } else {
                    Log.i("ERROR", String.valueOf(response.code()));
                }
            }
            @Override
            public void onFailure(Throwable t) {
                Log.i("ERROR", String.valueOf(t.getMessage().toString()));
            }
        });
    }

    private void setData(List<Hit> dataList) {
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), dataList);
        RV.setHasFixedSize(true);
        RV.setLayoutManager(new LinearLayoutManager(getActivity()));
        RV.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}