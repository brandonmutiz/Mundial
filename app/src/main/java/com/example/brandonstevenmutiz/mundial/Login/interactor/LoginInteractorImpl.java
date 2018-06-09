package com.example.brandonstevenmutiz.mundial.Login.interactor;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;
import com.example.brandonstevenmutiz.mundial.Login.presenter.LoginPresenter;
import com.example.brandonstevenmutiz.mundial.Login.repository.LoginRepository;
import com.example.brandonstevenmutiz.mundial.Login.repository.LoginRepositoryImpl;

import java.util.List;

public class LoginInteractorImpl implements LoginInteractor {
    LoginPresenter loginPresenter;
    LoginRepository loginRepository;

    public LoginInteractorImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
        loginRepository= new LoginRepositoryImpl(this);
    }

    @Override
    public void SingIn(String user, String pass) {

        if ("".equals(user) || "".equals(pass)){
            loginPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginRepository.SingIn(user, pass);
        }
    }

    @Override
    public void processData(List<Login> loginList) {
        Boolean searchUser = loginList.get(0).isSearchUser();

        if (searchUser){
            loginPresenter.showResult(loginList);
        }else{
            loginPresenter.showError("El usuario ingresado no existe");
        }
    }
}
