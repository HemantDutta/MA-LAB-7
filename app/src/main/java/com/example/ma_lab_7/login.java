package com.example.ma_lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openGithub()
    {
        Intent openGit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/HemantDutta"));
        startActivity(openGit);
    }

    public void login(View view){
        Intent intent = new Intent(this, home.class);

        EditText username = findViewById(R.id.editTextText2);
        EditText password = findViewById(R.id.editTextTextPassword);

        if(!username.getText().toString().equalsIgnoreCase("") && password.getText().toString().equalsIgnoreCase("admin")){
            String message = "Welcome "+username.getText().toString();
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

            intent.putExtra("username", username.getText().toString());

            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Wrong Credentials, Try Again!", Toast.LENGTH_SHORT).show();
        }
    }
}