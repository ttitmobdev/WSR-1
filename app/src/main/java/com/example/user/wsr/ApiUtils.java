package com.example.user.wsr;

public class ApiUtils {
    private ApiUtils(){}
    public static final String BaseUrl = "http://192.168.12.69:8080/";
    public static API getApiService(){
        return RetrofitClient.getClient(BaseUrl).create(API.class);
    }
}
