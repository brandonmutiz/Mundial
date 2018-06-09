package com.example.brandonstevenmutiz.mundial.Login.interactor;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;

import java.util.List;

public interface LoginInteractor {
    void SingIn(String user,String pass);
    void processData(List<Login> loginList);
}
