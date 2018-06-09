package com.example.brandonstevenmutiz.mundial.Registro.Presenter;

import com.example.brandonstevenmutiz.mundial.Registro.Interactor.RegistroInteractor;
import com.example.brandonstevenmutiz.mundial.Registro.Interactor.RegistroInteractorImpl;
import com.example.brandonstevenmutiz.mundial.Registro.View.RegistroView;
import com.example.brandonstevenmutiz.mundial.Registro.model.Account;

public class RegistroPresenterImpl implements RegistroPresenter {
    RegistroInteractor registroInteractor;
    RegistroView registroView;

    public RegistroPresenterImpl(RegistroView registroView) {
        this.registroView = registroView;
        registroInteractor= new RegistroInteractorImpl(this);
    }

    @Override
    public void createAccount(Account account) {
       registroInteractor.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        registroView.showResult(msg);
    }

    @Override
    public void showError(String msg) {
        registroView.showResult(msg);
    }
}
