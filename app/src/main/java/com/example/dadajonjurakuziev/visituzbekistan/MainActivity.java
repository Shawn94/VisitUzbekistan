package com.example.dadajonjurakuziev.visituzbekistan;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout NavGridBar;
    CardView cvHome, cvHotels, cvRentalCar, cvVideos, cvAboutUs, cvMap;
    ImageButton navButton;
    SearchView search;
    RelativeLayout top_bar_relative;
    LinearLayout main_bg;
    Button citiesBtn;
    TextView title_uzb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavGridBar = findViewById(R.id.NavGridBar);
        SearchView searchView = findViewById(R.id.searchView);
        top_bar_relative = findViewById(R.id.tool_bar_layout);
        navButton = findViewById(R.id.navButton);
        main_bg = findViewById(R.id.main_bg);
        citiesBtn = findViewById(R.id.citiesBtn);
        title_uzb = findViewById(R.id.title_uzb);

        cvHome = findViewById(R.id.btnHome);
        cvHotels = findViewById(R.id.btnHotels);
        cvRentalCar = findViewById(R.id.btnRentalCar);
        cvVideos = findViewById(R.id.btnVideos);
        cvAboutUs = findViewById(R.id.btnAboutUs);
        cvMap = findViewById(R.id.btnMap);


        /*Change color of text and hint text*/
        EditText searchEditText = searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(getResources().getColor(R.color.white));
        searchEditText.setHintTextColor(getResources().getColor(R.color.white));
        /*Change the underline color*/
        View searchplate = searchView.findViewById(android.support.v7.appcompat.R.id.search_plate);
        searchplate.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);

        cvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        cvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Hotels", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });
        cvRentalCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Rental Car", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RentalCarActivity.class);
                startActivity(intent);
            }
        });
        cvVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Videos", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, VideosActivity.class);
                startActivity(intent);
            }
        });
        cvAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on About Us", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });
        cvMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Map", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainMapActivity.class);
                startActivity(intent);
            }
        });

        citiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on Cities", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CitiesActivity.class);
                startActivity(intent);
            }
        });


    }
    boolean isVisible = true;
    public void navBarShowUp(View view) {
        if (isVisible) {
            NavGridBar.setVisibility(View.VISIBLE);
            NavGridBar.animate().alpha(1.0f).setDuration(100);
            top_bar_relative.setBackgroundColor(getResources().getColor(R.color.toolbar_color));
            top_bar_relative.animate().alpha(1.0f).setDuration(100);

            main_bg.getBackground().setColorFilter(0xff959595, PorterDuff.Mode.MULTIPLY);
            citiesBtn.getBackground().setColorFilter(0xff959595, PorterDuff.Mode.MULTIPLY);
            citiesBtn.setTextColor(0xff959595);
            title_uzb.setTextColor(0xff959595);
            isVisible = false;
        } else {
            NavGridBar.setVisibility(View.INVISIBLE);
            NavGridBar.animate().alpha(0.8f).setDuration(100);
            top_bar_relative.setBackgroundColor(Color.TRANSPARENT);
            top_bar_relative.animate().alpha(1.0f).setDuration(500);

            main_bg.getBackground().setColorFilter(0xffffffff, PorterDuff.Mode.MULTIPLY);
            citiesBtn.getBackground().setColorFilter(0xffffffff, PorterDuff.Mode.MULTIPLY);
            title_uzb.setTextColor(0xffffffff);
            citiesBtn.setTextColor(0xffffffff);
            isVisible = true;
        }
    }
}
