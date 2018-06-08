package com.example.brandonstevenmutiz.mundial.leyenda.repository;



import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.leyenda.Interactor.LeyendaInteractor;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeyendaRepositoryImpl implements LeyendaRepository{
    LeyendaInteractor leyendaInteractor;
    List<Leyenda> leyendaList;



    public LeyendaRepositoryImpl(LeyendaInteractor leyendaInteractor) {
        this.leyendaInteractor=leyendaInteractor;
    }

    @Override
    public void getDataLeyenda() {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Leyenda>> leyenda=service.getDataLeyenda();
        leyenda.enqueue(new Callback<List<Leyenda>>() {
            @Override
            public void onResponse(Call<List<Leyenda>> call, Response<List<Leyenda>> response) {
                leyendaList=response.body();
                leyendaInteractor.showResultLeyenda(leyendaList);
            }

            @Override
            public void onFailure(Call<List<Leyenda>> call, Throwable t) {

            }
        });



    }
}
