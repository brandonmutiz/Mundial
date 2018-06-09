package com.example.brandonstevenmutiz.mundial.ApiRest;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;
import com.example.brandonstevenmutiz.mundial.Registro.model.Account;
import com.example.brandonstevenmutiz.mundial.Respuestas.model.Respuestas;
import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service {
    @GET(Constants.ROOT_MUNDIALES)
    Call<List<Mundial>> getDataMundial();

    @GET(Constants.ROOT_PROFESIONAL)
    Call<List<Profesional>> getDataProfesional();

    @GET(Constants.ROOT_ESTRELLA)
    Call<List<Estrella>> getDataEstrella();

    @GET(Constants.ROOT_LEYENDA)
    Call<List<Leyenda>> getDataLeyenda();

    @POST(Constants.ROOT_SINGUP)
    @FormUrlEncoded
    Call<List<Account>> onSignUp(
            @Field("user") String user,
            @Field("pass") String pass
    );

    @POST(Constants.ROOT_LOGIN)
    @FormUrlEncoded
    Call<List<Login>> onSignIn(
            @Field("user") String user,
            @Field("pass") String pass
    );
    @GET(Constants.ROOT_RESPUESTAS)
    Call<List<Respuestas>> getDataRespuestas();

}
