package com.farrukhworkstation.demoapplication;

import android.app.Application;

import com.farrukhworkstation.demoapplication.components.DaggerMyNetworkRequestComponent;
import com.farrukhworkstation.demoapplication.components.DaggerNetComponent;
import com.farrukhworkstation.demoapplication.components.MyNetworkRequestComponent;
import com.farrukhworkstation.demoapplication.components.NetComponent;
import com.farrukhworkstation.demoapplication.modules.AppModule;
import com.farrukhworkstation.demoapplication.modules.MyNetworkRequestModule;
import com.farrukhworkstation.demoapplication.modules.NetModule;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Farrukh Work Station on 6/27/2016.
 */
public class DemoApplication extends Application {
    private NetComponent mNetComponent;
    private MyNetworkRequestComponent myNetworkRequestComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        FlowManager.init(this);
//        FlowManager.init(new FlowConfig.Builder(this)
//                .addDatabaseConfig(
//                        new DatabaseConfig.Builder(CipherDatabase.class)
//                                .openHelper(new DatabaseConfig.OpenHelperCreator() {
//                                    @Override
//                                    public OpenHelper createHelper(DatabaseDefinition databaseDefinition, DatabaseHelperListener helperListener) {
//                                        return new SQLCipherHelperImpl(databaseDefinition, helperListener);
//                                    }
//                                })
//                                .build())
//                .build());

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://pixabay.com/"))
                .build();

        myNetworkRequestComponent = DaggerMyNetworkRequestComponent.builder()
                .netComponent(mNetComponent)
                .myNetworkRequestModule(new MyNetworkRequestModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public MyNetworkRequestComponent getmyNetworkRequestComponent() {
        return myNetworkRequestComponent;
    }
}