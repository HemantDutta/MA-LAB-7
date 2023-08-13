package com.example.ma_lab_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent getPrevInt = getIntent();
        String username = getPrevInt.getStringExtra("username");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.armor_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.item1){
            Intent goRating = new Intent(this, rating.class);
            startActivity(goRating);
            return true;
        }
        if(id == R.id.item2){
            Intent goFeed = new Intent(this, feedback.class);
            startActivity(goFeed);
            return true;
        }
        if(id == R.id.item3){
            Intent logout = new Intent(this, login.class);
            startActivity(logout);
            return true;
        }
        return true;
    }
}