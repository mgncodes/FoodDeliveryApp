package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    Button signout, gotomenu, addfood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        signout = findViewById(R.id.signout);
        gotomenu = findViewById(R.id.gotofoodmenu);
        addfood = findViewById(R.id.addfood);

        gotomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(HomeScreen.this, FoodMenu.class);
                startActivity(i2);
                finish();
            }
        });

        addfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(), AddFoodDetails.class);
                startActivity(i3);
                finish();
            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(i1);
                finish();
            }
        });



    }
}