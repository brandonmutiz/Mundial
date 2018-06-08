package com.example.brandonstevenmutiz.mundial.profesional.Presenter;

import com.example.brandonstevenmutiz.mundial.mundial.Interactor.MundialInteractor;
import com.example.brandonstevenmutiz.mundial.mundial.View.MundialView;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.example.brandonstevenmutiz.mundial.profesional.Interactor.ProfesionalInteractor;
import com.example.brandonstevenmutiz.mundial.profesional.Interactor.ProfesionalInteractorImpl;
import com.example.brandonstevenmutiz.mundial.profesional.View.ProfesionalView;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

public class ProfesionalPresenterImpl implements ProfesionalPresenter{
    ProfesionalInteractor profesionalInteractor;
    ProfesionalView profesionalView;

    public ProfesionalPresenterImpl(ProfesionalView profesionalView){
        this.profesionalView=profesionalView;
        profesionalInteractor= new ProfesionalInteractorImpl(this);

        }

    @Override
    public void showResultProfesional(List<Profesional> profesionalList) {
        profesionalView.showResultMundial(profesionalList);
    }

    @Override
    public void getDataProfesional() {
        profesionalInteractor.getDataProfesional();
    }
}





