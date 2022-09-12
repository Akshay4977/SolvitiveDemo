package com.example.solvativedemo.retrofit;

import com.example.solvativedemo.model.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("artworks?page=1&limit=5")
    Call<MainModel> requestOtpCall();
}
