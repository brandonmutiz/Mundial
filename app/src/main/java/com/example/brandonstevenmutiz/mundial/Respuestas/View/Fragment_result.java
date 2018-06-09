package com.example.brandonstevenmutiz.mundial.Respuestas.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brandonstevenmutiz.mundial.ApiRest.RestApiAdapter;
import com.example.brandonstevenmutiz.mundial.ApiRest.Service;
import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.Respuestas.adapter.RespuestasAdapter;
import com.example.brandonstevenmutiz.mundial.Respuestas.model.Respuestas;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_result extends Fragment {
RecyclerView recyclerView;
    List<Respuestas> respuestasList;
    public Fragment_result() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.id_rcv_respuestas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        servicio();
        return view;


    }
    public  void servicio(){
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Respuestas>> groups = service.getDataRespuestas();
        groups.enqueue(new Callback<List<Respuestas>>() {
            @Override
            public void onResponse(Call<List<Respuestas>> call, Response<List<Respuestas>> response) {
                respuestasList=response.body();
                showResult(respuestasList);
            }

            @Override
            public void onFailure(Call<List<Respuestas>> call, Throwable t) {

            }
        });


    }
    public void showResult(List<Respuestas> respuestasList){
        recyclerView.setAdapter(new RespuestasAdapter(respuestasList,getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setVisibility(View.VISIBLE);
    }

}
