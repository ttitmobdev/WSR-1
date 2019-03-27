package com.example.user.wsr;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface API {
    @POST("/api-token-auth/")
    @FormUrlEncoded
    Call<TokenResponse> signIn(@Field("username") String user,@Field("password") String password);

    @GET("/snippets")
    Call<List<Model>> getCode(@Header("Authorization") String token);

}
