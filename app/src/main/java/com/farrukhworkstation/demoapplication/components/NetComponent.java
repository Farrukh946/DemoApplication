package com.farrukhworkstation.demoapplication.components;


import android.content.SharedPreferences;

import com.farrukhworkstation.demoapplication.modules.AppModule;
import com.farrukhworkstation.demoapplication.modules.NetModule;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();
}