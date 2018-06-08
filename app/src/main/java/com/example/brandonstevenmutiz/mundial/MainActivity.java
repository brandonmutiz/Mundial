package com.example.brandonstevenmutiz.mundial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bottom (View view){
        Intent intent = new Intent(MainActivity.this, home.class);
        startActivity(intent);
    }

    public void CrearCuenta (View view){
        Intent intent = new Intent(MainActivity.this, crear_cuenta.class);
        startActivity(intent);
    }


}
