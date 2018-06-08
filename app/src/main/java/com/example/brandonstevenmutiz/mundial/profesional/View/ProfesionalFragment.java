package com.example.brandonstevenmutiz.mundial.profesional.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.mundial.Presenter.MundialPresenter;
import com.example.brandonstevenmutiz.mundial.mundial.Presenter.MundialPresenterImpl;
import com.example.brandonstevenmutiz.mundial.mundial.View.MundialView;
import com.example.brandonstevenmutiz.mundial.profesional.Presenter.ProfesionalPresenter;
import com.example.brandonstevenmutiz.mundial.profesional.Presenter.ProfesionalPresenterImpl;
import com.example.brandonstevenmutiz.mundial.profesional.adapter.ProfesionalAdapter;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfesionalFragment extends Fragment implements ProfesionalView {
    RecyclerView recyclerView;
    ProfesionalPresenter profesionalPresenter;

    public ProfesionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =inflater.inflate(R.layout.fragment_profesional, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.id_rcv_profesional);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        profesionalPresenter=new ProfesionalPresenterImpl(this);
        profesionalPresenter.getDataProfesional();
        return view;
    }

    @Override
    public void showResultMundial(List<Profesional> profesionalList) {
        recyclerView.setAdapter(new ProfesionalAdapter(profesionalList,getContext()));
        recyclerView.setVisibility(View.VISIBLE);
        recyclerView.setHasFixedSize(true);
    }
}
