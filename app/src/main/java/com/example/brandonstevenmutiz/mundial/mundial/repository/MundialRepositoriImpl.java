package com.example.brandonstevenmutiz.mundial.mundial.repository;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.mundial.Interactor.MundialInteractor;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MundialRepositoriImpl implements MundialRepository{
    MundialInteractor mundialInteractor;
    List<Mundial> mundialList;

    public MundialRepositoriImpl(MundialInteractor mundialInteractor) {

        this.mundialInteractor = mundialInteractor;
    }

    @Override
    public void getDataMundidal() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Mundial>> groups = service.getDataMundial();
        groups.enqueue(new Callback<List<Mundial>>() {
            @Override
            public void onResponse(Call<List<Mundial>> call, Response<List<Mundial>> response) {
                mundialList=response.body();
                mundialInteractor.showResultMundial(mundialList);
            }

            @Override
            public void onFailure(Call<List<Mundial>> call, Throwable t) {

            }
        });

    }
}
