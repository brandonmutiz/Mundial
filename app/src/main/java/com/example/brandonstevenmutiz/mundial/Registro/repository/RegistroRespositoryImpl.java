package com.example.brandonstevenmutiz.mundial.Registro.repository;

import android.util.Log;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.Registro.Interactor.RegistroInteractor;
import com.example.brandonstevenmutiz.mundial.Registro.model.Account;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistroRespositoryImpl implements RegistroRepository{
   RegistroInteractor registroInteractor;
    List<Account> accountList;

    public RegistroRespositoryImpl(RegistroInteractor registroInteractor) {
        this.registroInteractor = registroInteractor;
    }

    @Override
    public void createAccount(Account account) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignUp(account.getUser(),account.getPassword()).enqueue(new Callback<List<Account>>() {
            @Override
            public void onResponse(Call<List<Account>> call, Response<List<Account>> response) {
                accountList = response.body();
                //loginActivityInteractor.processData(loginList);
                registroInteractor.showResult("Registro Efectuado");
                String json = new Gson().toJson(accountList);
                Log.d("AccountPost", json);
            }

            @Override
            public void onFailure(Call<List<Account>> call, Throwable t) {
                registroInteractor.showResult("Registrado ");
            }
        });
    }
}
