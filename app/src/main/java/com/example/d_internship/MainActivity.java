package com.example.d_internship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;



    RefineFragment refineFragment = new RefineFragment();
    ExploreFragment exploreFragment =new ExploreFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigation);


        //getSupportFragmentManager().beginTransaction().replace(R.id.container,exploreFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.Explore) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, exploreFragment).commit();
                    return true;
                } else if (itemId == R.id.Refine) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, refineFragment).commit();
                    return true;
                }
                return false;
            }
        });
        displayFragment1();
        }
    private void displayFragment1() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ExploreFragment()) // Replace with your Fragment 1
                .commit();
    }


    }
