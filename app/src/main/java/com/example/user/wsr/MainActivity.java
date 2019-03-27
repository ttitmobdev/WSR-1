package com.example.user.wsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    String username = "user";
    String password = "QWEasd123user";
    private API api;
    Adapter adapter;
    RecyclerView rec;
    List<Model> newsResponses;
    String userToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsResponses = new ArrayList<>();
        rec = findViewById(R.id.rec);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rec.setLayoutManager(layoutManager);
        rec.setAdapter(adapter);
        api = ApiUtils.getApiService();
        loadToken(username,password);
        loadCode(userToken);
    }
    public void loadToken(String username,String password){
        api.signIn(username,password).enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(retrofit2.Call<TokenResponse> call, Response<TokenResponse> response) {
                if (response.isSuccessful()) {
                    userToken = "Bearer " + response.body().getToken();
                    Toast.makeText(getApplicationContext(),"token"+userToken,Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(retrofit2.Call<TokenResponse> call, Throwable t) {

            }
        });
    }
    public void loadCode(String token){
        api.getCode(token).enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Model>> call, Response<List<Model>> response) {
                if (response.isSuccessful()){
                    newsResponses.addAll(response.body());
                    rec.getAdapter().notifyDataSetChanged();
                }
                else
                    Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(retrofit2.Call<List<Model>> call, Throwable t) {

            }
        });
    }
}
