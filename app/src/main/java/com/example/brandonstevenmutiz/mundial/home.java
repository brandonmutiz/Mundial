package com.example.brandonstevenmutiz.mundial;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.brandonstevenmutiz.mundial.estrella.View.Fragment_estrella;
import com.example.brandonstevenmutiz.mundial.leyenda.View.Fragment_leyenda;
import com.example.brandonstevenmutiz.mundial.mundial.View.Fragment_mundial;
import com.example.brandonstevenmutiz.mundial.profesional.View.ProfesionalFragment;

public class home extends AppCompatActivity {
    BottomNavigationItemView bottonNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottonNavigation = (BottomNavigationView) findViewById(R.id.id_bottonNavigation);

        bottonNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()){
                    case R.id.id_profesional:
                         ProfesionalFragment profesionalFragment = new ProfesionalFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, profesionalFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.id_estrella:
                        Fragment_estrella Fragment_estrella = new Fragment_estrella();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_estrella)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.id_leyenda:
                        Fragment_leyenda Fragment_leyenda = new Fragment_leyenda();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_leyenda)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;


                    case R.id.id_mundial:
                        Fragment_mundial Fragment_mundial = new Fragment_mundial();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_mundial)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;


                    case R.id.id_result:
                        Fragment_result Fragment_result = new Fragment_result();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_result)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)

                                .commit();

                        break;
                }
                return true;
            }
        });

    }
}
