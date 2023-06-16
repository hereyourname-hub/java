package com.example.bodyboost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedpreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(),"Welcom"+username,Toast.LENGTH_SHORT).show();

        CardView findWater = findViewById(R.id.tv_water_card);
        findWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,WaterActivity.class));
            }
        });

        CardView findMedicine = findViewById(R.id.tv_medicine_card);
        findMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,MedicineActivity.class));
            }
        });



        CardView findFood = findViewById(R.id.tv_food_card);
        findFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,FoodActivity.class));
            }
        });






        CardView findSleep = findViewById(R.id.tv_sleep_card);
        findSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,SleepActivity.class));
            }
        });




    }


}