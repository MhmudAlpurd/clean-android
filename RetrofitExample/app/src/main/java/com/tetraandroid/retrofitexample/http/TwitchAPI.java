package com.tetraandroid.retrofitexample.http;

import com.tetraandroid.retrofitexample.http.apimodel.Twitch;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TwitchAPI {

    @GET("games/top")
    Call<Twitch> getTopGames(@Header("Client-Id") String clientId);





}
