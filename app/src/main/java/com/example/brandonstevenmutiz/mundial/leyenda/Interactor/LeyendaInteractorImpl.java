package com.example.brandonstevenmutiz.mundial.leyenda.Interactor;

import com.example.brandonstevenmutiz.mundial.leyenda.Presenter.LeyendaPresenter;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.leyenda.repository.LeyendaRepository;
import com.example.brandonstevenmutiz.mundial.leyenda.repository.LeyendaRepositoryImpl;

import java.util.List;

public class LeyendaInteractorImpl implements  LeyendaInteractor {
    LeyendaPresenter leyendaPresenter;
    LeyendaRepository leyendaRepository;

    public LeyendaInteractorImpl(LeyendaPresenter leyendaPresenter) {
        this.leyendaPresenter=leyendaPresenter;
        leyendaRepository=new LeyendaRepositoryImpl(this);


    }

    @Override
    public void getDataLeyenda() { leyendaRepository.getDataLeyenda(); }


    @Override
    public void showResultLeyenda(List<Leyenda> leyendaList) {
        leyendaPresenter.showResultLeyenda(leyendaList);

    }
}
