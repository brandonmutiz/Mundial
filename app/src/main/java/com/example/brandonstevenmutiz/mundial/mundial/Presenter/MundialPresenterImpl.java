package com.example.brandonstevenmutiz.mundial.mundial.Presenter;

import com.example.brandonstevenmutiz.mundial.mundial.Interactor.MundialInteractor;
import com.example.brandonstevenmutiz.mundial.mundial.Interactor.MundialInteractorImpl;
import com.example.brandonstevenmutiz.mundial.mundial.View.MundialView;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;

import java.util.List;

public class MundialPresenterImpl implements MundialPresenter {
    MundialInteractor mundialInteractor;
    MundialView mundialView;

    public MundialPresenterImpl(MundialView mundialView) {
        this.mundialView = mundialView;
        mundialInteractor= new MundialInteractorImpl(this);
    }


    @Override
    public void showResultMundial(List<Mundial> mundialList) {
    mundialView.showResultMundial(mundialList);
    }


    @Override
    public void getDataMundial() {
    mundialInteractor.getDataMundial();
    }
}
