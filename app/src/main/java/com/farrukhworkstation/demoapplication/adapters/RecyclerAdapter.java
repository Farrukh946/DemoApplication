package com.farrukhworkstation.demoapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farrukhworkstation.demoapplication.DemoApplication;
import com.farrukhworkstation.demoapplication.R;
import com.farrukhworkstation.demoapplication.models.Hit;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Hit> dataList;
    Context c;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image)
        ImageView pic;

        @BindView(R.id.username)
        TextView username;
        @BindView(R.id.tags)
        TextView tags;
        @BindView(R.id.likes)
        TextView likes;
        @BindView(R.id.downloads)
        TextView downloads;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }


    public RecyclerAdapter(Context c, List<Hit> dataList) {
        this.c = c;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Hit dataObject = dataList.get(position);
        Picasso.with(c)
                .load(dataObject.getUserImageURL())
                .resize(80, 80)
                .centerCrop()
                .into(holder.pic);
        holder.username.setText(dataObject.getUser());
        holder.tags.setText(dataObject.getTags());
        holder.likes.setText(Integer.toString(dataObject.getLikes()));
        holder.downloads.setText(Integer.toString(dataObject.getDownloads()));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}