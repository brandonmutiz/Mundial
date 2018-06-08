package com.example.brandonstevenmutiz.mundial.mundial.View;


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
import com.example.brandonstevenmutiz.mundial.mundial.adapter.MundialAdapter;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_mundial extends Fragment implements MundialView{
RecyclerView recyclerView;
MundialPresenter mundialPresenter;
    public Fragment_mundial() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_mundial, container, false);

         recyclerView=(RecyclerView)view.findViewById(R.id.id_rcv_mundial);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mundialPresenter=new MundialPresenterImpl(this);
        mundialPresenter.getDataMundial();
        return view;
    }

    @Override
    public void showResultMundial(List<Mundial> calendarList) {
        recyclerView.setAdapter(new MundialAdapter(calendarList, getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setVisibility(View.VISIBLE);

    }
}
