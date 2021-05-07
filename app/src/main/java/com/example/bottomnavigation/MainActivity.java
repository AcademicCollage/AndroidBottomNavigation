package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigation.fragment.First;
import com.example.bottomnavigation.fragment.Second;
import com.example.bottomnavigation.fragment.Third;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView myNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new First()).commit();
        myNavigation=findViewById(R.id.my_navigation);
        myNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.first:
                        getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new First()).commit();
                        break;
                    case R.id.second:
                        getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new Second()).commit();
                        break;
                    case R.id.third:
                        getSupportFragmentManager().beginTransaction().replace(R.id.screen_to_show,new Third()).commit();
                        break;
                }
                return true;
            }
        });


    }
}