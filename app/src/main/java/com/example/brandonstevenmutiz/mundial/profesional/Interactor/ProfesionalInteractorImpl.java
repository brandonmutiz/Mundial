package com.example.brandonstevenmutiz.mundial.profesional.Interactor;

import com.example.brandonstevenmutiz.mundial.profesional.Presenter.ProfesionalPresenter;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;
import com.example.brandonstevenmutiz.mundial.profesional.repository.ProfesionalRepository;
import com.example.brandonstevenmutiz.mundial.profesional.repository.ProfesionalRepositoryImpl;

import java.util.List;

public class ProfesionalInteractorImpl implements  ProfesionalInteractor{
    ProfesionalPresenter profesionalPresenter;
    ProfesionalRepository profesionalRepository;

    public ProfesionalInteractorImpl(ProfesionalPresenter profesionalPresenter){
        this.profesionalPresenter=profesionalPresenter;
        profesionalRepository= new ProfesionalRepositoryImpl(this);
    }

    @Override
    public void getDataProfesional() {
        profesionalRepository.getDataProfesional();
    }

    @Override
    public void showResultProfesional(List<Profesional> profesionalList) {
        profesionalPresenter.showResultProfesional(profesionalList);
    }
}
