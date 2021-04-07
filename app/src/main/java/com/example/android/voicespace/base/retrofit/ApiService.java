package com.example.android.voicespace.base.retrofit;


import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.example.android.voicespace.base.retrofit.URL_api.articles;

public interface ApiService {

    @GET(articles)
    Call<JsonArray> requestArticle();

}

