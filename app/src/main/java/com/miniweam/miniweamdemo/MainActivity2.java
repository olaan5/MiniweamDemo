package com.miniweam.miniweamdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        navigationView = findViewById(R.id.nav_view);

        replaceFragment(new MiniweamFragment());

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_miniweam:
                    replaceFragment(new MiniweamFragment());
                    break;
                case R.id.navigation_tech:
                    replaceFragment(new TechFragment());
                    break;
                case R.id.navigation_designs:
                    replaceFragment(new DesignsFragment());
                    break;
                default:
            }
            return true;
        });
    }

    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, fragment);
        fragmentTransaction.commit();
    }
}

