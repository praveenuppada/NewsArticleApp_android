package com.example.newsarticle.network;


import com.example.newsarticle.model.NewsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApiServices {

    @GET("everything")
    Call<NewsResponse> getNews(
            @Query("q") String query,
            @Query("from") String fromDate,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey
    );


}
