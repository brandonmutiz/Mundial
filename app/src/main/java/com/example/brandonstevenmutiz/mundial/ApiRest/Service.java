package com.example.brandonstevenmutiz.mundial.ApiRest;

import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET(Constants.ROOT_MUNDIALES)
    Call<List<Mundial>> getDataMundial();

    @GET(Constants.ROOT_PROFESIONAL)
    Call<List<Profesional>> getDataProfesional();

    @GET(Constants.ROOT_ESTRELLA)
    Call<List<Estrella>> getDataEstrella();

    @GET(Constants.ROOT_LEYENDA)
    Call<List<Leyenda>> getDataLeyenda();
}
