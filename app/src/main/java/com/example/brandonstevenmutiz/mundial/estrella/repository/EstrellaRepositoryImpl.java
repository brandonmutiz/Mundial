package com.example.brandonstevenmutiz.mundial.estrella.repository;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.estrella.Interactor.EstrellaInteractor;
import com.example.brandonstevenmutiz.mundial.estrella.Presenter.EstrellaPresenter;
import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EstrellaRepositoryImpl implements EstrellaRepository{

    EstrellaInteractor estrellaInteractor;
    List<Estrella> estrellaList;


    public EstrellaRepositoryImpl(EstrellaInteractor estrellaInteractor) {
        this.estrellaInteractor=estrellaInteractor;
    }

    @Override
    public void getDataEstrella() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Estrella>> groups = service.getDataEstrella();
        groups.enqueue(new Callback<List<Estrella>>(){


    @Override
            public void onResponse(Call<List<Estrella>> call, Response<List<Estrella>> response) {

                estrellaList=response.body();
                estrellaInteractor.showResultEstrella(estrellaList);


            }

            @Override
            public void onFailure(Call<List<Estrella>> call, Throwable t) {

            }
        });
    }
}
