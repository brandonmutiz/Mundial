package com.example.brandonstevenmutiz.mundial.mundial.Interactor;

import com.example.brandonstevenmutiz.mundial.mundial.Presenter.MundialPresenter;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.example.brandonstevenmutiz.mundial.mundial.repository.MundialRepositoriImpl;
import com.example.brandonstevenmutiz.mundial.mundial.repository.MundialRepository;

import java.util.List;

public class MundialInteractorImpl implements MundialInteractor{
    MundialPresenter mundialPresenter;
    MundialRepository mundialRepository;

    public MundialInteractorImpl(MundialPresenter mundialPresenter) {
        this.mundialPresenter = mundialPresenter;
        mundialRepository= new MundialRepositoriImpl(this);
    }

    @Override
    public void getDataMundial() {
        mundialRepository.getDataMundidal();

    }

    @Override
    public void showResultMundial(List<Mundial> mundialList) {
        mundialPresenter.showResultMundial(mundialList);
    }
}
