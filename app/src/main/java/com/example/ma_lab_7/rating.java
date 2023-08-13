package com.example.ma_lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.Toast;

public class rating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    public void rate(View view){
        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar);
        DatePicker dp = (DatePicker) findViewById(R.id.datePicker);
        int day = dp.getDayOfMonth();
        int month = dp.getMonth();
        int year = dp.getYear();
        Toast.makeText(this, "Thank you for your feedback: "+bar.getRating()+", Submitted on: "+day+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
        Intent openHome = new Intent(this, home.class);
        startActivity(openHome);
    }
}