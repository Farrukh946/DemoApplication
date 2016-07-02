package com.farrukhworkstation.demoapplication.modules;

import com.farrukhworkstation.demoapplication.Utilities.Constants;
import com.farrukhworkstation.demoapplication.networkInterfaces.MyNetworkInterface;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * Created by Farrukh Work Station on 6/26/2016.
 */

@Module
public class MyNetworkRequestModule {
    @Provides
    public MyNetworkInterface providesMyNetworkInterface(Retrofit retrofit) {
        return retrofit.create(MyNetworkInterface.class);
    }

    @Provides
    public Constants providesMyConstants() {
        return new Constants();
    }
}