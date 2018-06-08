package com.example.brandonstevenmutiz.mundial.leyenda.Presenter;

import com.example.brandonstevenmutiz.mundial.leyenda.Interactor.LeyendaInteractor;
import com.example.brandonstevenmutiz.mundial.leyenda.Interactor.LeyendaInteractorImpl;
import com.example.brandonstevenmutiz.mundial.leyenda.View.LeyendaView;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;

import java.util.List;

public class LeyendaPresenterImpl implements LeyendaPresenter {

    LeyendaInteractor leyendaInteractor;
    LeyendaView leyendaView;

    public LeyendaPresenterImpl(LeyendaView leyendaView) {
        this.leyendaView=leyendaView;
        leyendaInteractor= new LeyendaInteractorImpl(this);
    }

    @Override
    public void showResultLeyenda(List<Leyenda> leyendaList) {

        leyendaView.showResultMundial(leyendaList);

    }

    @Override
    public void getDataLeyenda() {
        leyendaInteractor.getDataLeyenda();

    }
}
