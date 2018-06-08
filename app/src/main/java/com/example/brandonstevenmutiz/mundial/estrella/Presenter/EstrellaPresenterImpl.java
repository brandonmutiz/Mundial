package com.example.brandonstevenmutiz.mundial.estrella.Presenter;

import com.example.brandonstevenmutiz.mundial.estrella.Interactor.EstrellaInteractor;
import com.example.brandonstevenmutiz.mundial.estrella.Interactor.EstrellaInteractorImpl;
import com.example.brandonstevenmutiz.mundial.estrella.View.EstrellaView;
import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;

import java.util.List;

public class EstrellaPresenterImpl implements EstrellaPresenter {

    EstrellaInteractor estrellaInteractor;
    EstrellaView estrellaView;

    public EstrellaPresenterImpl(EstrellaView estrellaView) {

        this.estrellaView=estrellaView;
        estrellaInteractor= new EstrellaInteractorImpl(this);
    }

    @Override
    public void showResultEstrella(List<Estrella> estrellaList) {
        estrellaView.showResultEstrella(estrellaList);
    }


    @Override
            public void getDataEstrella() {
        estrellaInteractor.getDataEstrella();

            }




        }


