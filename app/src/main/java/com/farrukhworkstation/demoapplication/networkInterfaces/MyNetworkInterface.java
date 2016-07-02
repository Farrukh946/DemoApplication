package com.farrukhworkstation.demoapplication.networkInterfaces;

import com.farrukhworkstation.demoapplication.models.ImageModel;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Farrukh Work Station on 6/26/2016.
 */
public interface MyNetworkInterface {
    @GET("api/")
    Call<ImageModel> getFlowers(@Query("key") String apiKey, @Query("q") String imageCategory, @Query("image_type") String imageType);
}
