package com.example.brandonstevenmutiz.mundial.leyenda.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.leyenda.Presenter.LeyendaPresenter;
import com.example.brandonstevenmutiz.mundial.leyenda.Presenter.LeyendaPresenterImpl;
import com.example.brandonstevenmutiz.mundial.leyenda.apapter.LeyendaAdapter;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.profesional.Presenter.ProfesionalPresenterImpl;
import com.example.brandonstevenmutiz.mundial.profesional.adapter.ProfesionalAdapter;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_leyenda extends Fragment implements LeyendaView {
    RecyclerView recyclerView;
    LeyendaPresenter leyendaPresenter;



    public Fragment_leyenda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_leyenda, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.id_rcv_leyenda);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        leyendaPresenter=new LeyendaPresenterImpl(this);
        leyendaPresenter.getDataLeyenda();
        return view;

    }

    @Override
    public void showResultMundial(List<Leyenda> leyendaList) {
        recyclerView.setAdapter(new LeyendaAdapter(leyendaList,getContext()));
        recyclerView.setVisibility(View.VISIBLE);
        recyclerView.setHasFixedSize(true);
    }
}
