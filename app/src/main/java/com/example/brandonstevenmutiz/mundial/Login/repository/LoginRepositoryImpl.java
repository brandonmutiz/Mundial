package com.example.brandonstevenmutiz.mundial.Login.repository;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.Login.interactor.LoginInteractor;
import com.example.brandonstevenmutiz.mundial.Login.model.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepositoryImpl implements LoginRepository {
   LoginInteractor loginInteractor;
    List<Login> loginList;
    public LoginRepositoryImpl(LoginInteractor loginInteractor) {
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void SingIn(String user, String pass) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<Login>>() {
            @Override
            public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
                loginList = response.body();
                loginInteractor.processData(loginList);

            }

            @Override
            public void onFailure(Call<List<Login>> call, Throwable t) {

            }
        });


    }
}


