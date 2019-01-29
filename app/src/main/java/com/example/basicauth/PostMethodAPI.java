package com.example.basicauth;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface PostMethodAPI {
    @POST("posts")
    Call<List<Posts>> makePostCall();
}
