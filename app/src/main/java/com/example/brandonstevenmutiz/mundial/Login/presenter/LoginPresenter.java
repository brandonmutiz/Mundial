package com.example.brandonstevenmutiz.mundial.Login.presenter;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;

import java.util.List;

public interface LoginPresenter {
    void signIn(String user, String pass);
    void showResult(List<Login> loginList);
    void showError(String error);
}
