package com.example.user.wonderlandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
    }

    public void btn1_onClick(View view) {
        Intent myIntent = new Intent(this, StateActivity.class);
        startActivity(myIntent);
    }
}
