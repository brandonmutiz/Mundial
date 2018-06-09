package com.example.brandonstevenmutiz.mundial.Login.view;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;

import java.util.List;

public interface LoginView {
    void showResult(List<Login> loginList);
    void showError(String error);
}
