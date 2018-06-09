package com.example.brandonstevenmutiz.mundial.Registro.Interactor;

import com.example.brandonstevenmutiz.mundial.Registro.model.Account;

public interface RegistroInteractor {
    void createAccount(Account account);
    void showResult(String msg);
    void showError(String msg);
}
