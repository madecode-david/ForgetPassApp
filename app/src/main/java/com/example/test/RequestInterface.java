package com.example.test;

import com.example.test.models.ServerRequest;
import com.example.test.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("toursim/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
