package com.example.brandonstevenmutiz.mundial.Registro.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.brandonstevenmutiz.mundial.Login.view.MainActivity;
import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.Registro.Presenter.RegistroPresenter;
import com.example.brandonstevenmutiz.mundial.Registro.Presenter.RegistroPresenterImpl;
import com.example.brandonstevenmutiz.mundial.Registro.model.Account;

public class crear_cuenta extends AppCompatActivity implements RegistroView {
    RegistroPresenter registroPresenter;
    Button button;
    String user;
    String pass;
    EditText editTextUser, editTextPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        editTextUser=findViewById(R.id.editTextuser);
        editTextPass=findViewById(R.id.editTextpass);
        button=(Button)findViewById(R.id.id_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user=editTextUser.getText().toString();
                pass=editTextPass.getText().toString();
                Account account=new Account(user,pass);
                registroPresenter.createAccount(account);
            }
        });
        registroPresenter=new RegistroPresenterImpl(this);
    }



    @Override
    public void showResult(String msg) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showError(String msg) {

    }
}
