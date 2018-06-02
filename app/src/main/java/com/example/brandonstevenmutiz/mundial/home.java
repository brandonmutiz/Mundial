package com.example.brandonstevenmutiz.mundial;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

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
                    case R.id.id_levels:
                         Fragment_levels fragment_levels = new Fragment_levels();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, fragment_levels)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.id_Mundial:
                        Fragment_mundial Fragment_mundial = new Fragment_mundial();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_mundial)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.id_profile:
                        Fragment_perfil Fragment_perfil = new Fragment_perfil();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_frame, Fragment_perfil)
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
