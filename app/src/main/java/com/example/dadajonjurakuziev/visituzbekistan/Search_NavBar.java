package com.example.dadajonjurakuziev.visituzbekistan;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
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

public class Search_NavBar extends AppCompatActivity {
   /* private LinearLayout NavGridBar;
    private SearchView searchView;
    private SearchView.SearchAutoComplete mSearchAutoComplete;
    private RelativeLayout top_bar_relative;
    private ImageButton navButton;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_and_navbar);

        NavGridBar = findViewById(R.id.NavGridBar);
        searchView = findViewById(R.id.searchView);
        top_bar_relative = findViewById(R.id.tool_bar_layout);
        navButton = findViewById(R.id.navButton1);

        CardView cvHome = findViewById(R.id.btnHome);
        CardView cvHotels = findViewById(R.id.btnHotels);
        CardView cvRentalCar = findViewById(R.id.btnRentalCar);
        CardView cvVideos = findViewById(R.id.btnVideos);
        CardView cvAboutUs = findViewById(R.id.btnAboutUs);


//Change color of text and hint text

        EditText searchEditText = searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(getResources().getColor(R.color.white));
        searchEditText.setHintTextColor(getResources().getColor(R.color.white));
//Change the underline color

        View searchplate = searchView.findViewById(android.support.v7.appcompat.R.id.search_plate);
        searchplate.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);

        cvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search_NavBar.this, "Clicked on Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search_NavBar.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        cvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search_NavBar.this, "Clicked on Hotels", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search_NavBar.this, HotelsActivity.class);
                startActivity(intent);
            }
        });
        cvRentalCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search_NavBar.this, "Clicked on Rental Car", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search_NavBar.this, RentalCarActivity.class);
                startActivity(intent);
            }
        });
        cvVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search_NavBar.this, "Clicked on Videos", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search_NavBar.this, VideosActivity.class);
                startActivity(intent);
            }
        });
        cvAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search_NavBar.this, "Clicked on About Us", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search_NavBar.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });




    }


    boolean isVisible = true;

    public void navBarShowUp1(View view) {
        if (isVisible) {
            NavGridBar.setVisibility(View.VISIBLE);
            NavGridBar.animate().alpha(1.0f).setDuration(100);
            top_bar_relative.setBackgroundColor(getResources().getColor(R.color.toolbar_color));
            top_bar_relative.animate().alpha(1.0f).setDuration(100);

            isVisible = false;
        } else {
            NavGridBar.setVisibility(View.INVISIBLE);
            NavGridBar.animate().alpha(0.8f).setDuration(100);
            top_bar_relative.setBackgroundColor(Color.TRANSPARENT);
            top_bar_relative.animate().alpha(1.0f).setDuration(500);

            isVisible = true;
        }
    }*/


}
