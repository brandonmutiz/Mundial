package com.example.brandonstevenmutiz.mundial.estrella.Interactor;

import com.example.brandonstevenmutiz.mundial.estrella.Presenter.EstrellaPresenter;
import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;
import com.example.brandonstevenmutiz.mundial.estrella.repository.EstrellaRepository;
import com.example.brandonstevenmutiz.mundial.estrella.repository.EstrellaRepositoryImpl;

import java.util.List;

public class EstrellaInteractorImpl implements EstrellaInteractor {

EstrellaPresenter estrellaPresenter;
EstrellaRepository estrellaRepository;
    public EstrellaInteractorImpl(EstrellaPresenter estrellaPresenter) {

        this.estrellaPresenter=estrellaPresenter;
        estrellaRepository=new EstrellaRepositoryImpl(this);
    }

    @Override
    public  void getDataEstrella (){estrellaRepository.getDataEstrella();

    }

    @Override
    public void showResultEstrella(List<Estrella> estrellaList) {

        estrellaPresenter.showResultEstrella(estrellaList);

    }
}
