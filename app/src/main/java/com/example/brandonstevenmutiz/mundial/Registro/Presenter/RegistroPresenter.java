package com.example.brandonstevenmutiz.mundial.Registro.Presenter;

import com.example.brandonstevenmutiz.mundial.Registro.model.Account;

public interface RegistroPresenter {
    void createAccount(Account account);
    void showResult(String msg);
    void showError(String msg);
}
