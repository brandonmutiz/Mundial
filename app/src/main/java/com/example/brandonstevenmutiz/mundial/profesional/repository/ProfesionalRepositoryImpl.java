package com.example.brandonstevenmutiz.mundial.profesional.repository;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.mundial.Interactor.MundialInteractor;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.example.brandonstevenmutiz.mundial.profesional.Interactor.ProfesionalInteractor;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfesionalRepositoryImpl implements ProfesionalRepository{

    ProfesionalInteractor profesionalInteractor;
    List<Profesional> profesionalList;

    public ProfesionalRepositoryImpl(ProfesionalInteractor profesionalInteractor) {

        this.profesionalInteractor = profesionalInteractor;
    }

    @Override
    public void getDataProfesional() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Profesional>> groups = service.getDataProfesional();
        groups.enqueue(new Callback<List<Profesional>>(){

            @Override
            public void onResponse(Call<List<Profesional>> call, Response<List<Profesional>> response) {

                profesionalList=response.body();
                profesionalInteractor.showResultProfesional(profesionalList);

            }

            @Override
            public void onFailure(Call<List<Profesional>> call, Throwable t) {

            }
        });
    }
}


