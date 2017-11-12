package com.bebala.bebala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dialeka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialeka);
    }

    public void sejarahlampunga(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, sejarah_a.class);
        startActivity(tampil);
    }
    public void logout2(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, login.class);
        startActivity(tampil);
    }
}