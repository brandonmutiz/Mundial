package com.example.brandonstevenmutiz.mundial.Registro.Interactor;

import com.example.brandonstevenmutiz.mundial.Registro.Presenter.RegistroPresenter;
import com.example.brandonstevenmutiz.mundial.Registro.model.Account;
import com.example.brandonstevenmutiz.mundial.Registro.repository.RegistroRepository;
import com.example.brandonstevenmutiz.mundial.Registro.repository.RegistroRespositoryImpl;

public class RegistroInteractorImpl implements RegistroInteractor {
    RegistroRepository registroRepository;
    RegistroPresenter registroPresenter;

    public RegistroInteractorImpl(RegistroPresenter registroPresenter) {
        this.registroPresenter = registroPresenter;
        registroRepository=new RegistroRespositoryImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        registroRepository.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        showResult(msg);
    }

    @Override
    public void showError(String msg) {
        showResult(msg);
    }
}
