package com.example.solvativedemo.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static final String base_url = "https://api.artic.edu/api/v1/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit == null) {
            retrofit = new Retrofit.
                    Builder().
                    addConverterFactory(GsonConverterFactory.create(gson)).
                    baseUrl(base_url).
                    client(httpClient.build()).build();
        }
        return retrofit;
    }
}
