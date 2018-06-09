package com.example.brandonstevenmutiz.mundial.Login.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brandonstevenmutiz.mundial.Login.model.Login;
import com.example.brandonstevenmutiz.mundial.Login.presenter.LoginPresenter;
import com.example.brandonstevenmutiz.mundial.Login.presenter.LoginPresenterImpl;
import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.Registro.View.crear_cuenta;
import com.example.brandonstevenmutiz.mundial.home;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoginView {
    SharedPreferences sharedPreferences;
    LoginPresenter loginPresenter;
    TextView textViewUser, textViewPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter= new LoginPresenterImpl(this);
        textViewUser=(TextView)findViewById(R.id.editText4);
        textViewPass=(TextView)findViewById(R.id.editText5);
    }

    public void bottom(View view) {
        loginPresenter.signIn(textViewUser.getText().toString(),textViewPass.getText().toString());
    }


    public void CrearCuenta(View view) {
        Intent intent = new Intent(MainActivity.this, crear_cuenta.class);
        startActivity(intent);
    }


    @Override
    public void showResult(List<Login> loginList) {
        sharedPreferences = getSharedPreferences("PreferencesMundialLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user", loginList.get(0).getUser());
        editor.commit();
        Intent intent = new Intent(this, home.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }
}
