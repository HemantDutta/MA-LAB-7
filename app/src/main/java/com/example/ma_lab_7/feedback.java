package com.example.ma_lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void submitFeedback(View view){
        TextView subject = (TextView) findViewById(R.id.editTextText);
        TextView feedBack = (TextView) findViewById(R.id.editTextText3);

        if(!subject.getText().toString().equalsIgnoreCase("") && !feedBack.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(this, "Thank you for submitting Feedback!", Toast.LENGTH_SHORT).show();
            Intent sendBack = new Intent(this, home.class);
            startActivity(sendBack);
        }
    }
}