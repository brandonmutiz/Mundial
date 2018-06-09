package com.example.brandonstevenmutiz.mundial.Login.presenter;

import com.example.brandonstevenmutiz.mundial.Login.interactor.LoginInteractor;
import com.example.brandonstevenmutiz.mundial.Login.interactor.LoginInteractorImpl;
import com.example.brandonstevenmutiz.mundial.Login.model.Login;
import com.example.brandonstevenmutiz.mundial.Login.view.LoginView;

import java.util.List;

public class LoginPresenterImpl implements LoginPresenter {
    LoginInteractor loginInteractor;
    LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor=new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginInteractor.SingIn(user,pass);
    }

    @Override
    public void showResult(List<Login> loginList) {
        loginView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginView.showError(error);
    }
}
