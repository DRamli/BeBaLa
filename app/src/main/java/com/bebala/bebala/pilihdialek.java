package com.bebala.bebala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class pilihdialek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihdialek);


    }

    public void dialeka(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, dialeka.class);
        startActivity(tampil);
    }

    public void dialeko(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, dialeko.class);
        startActivity(tampil);
    }
    public void logout(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, login.class);
        startActivity(tampil);
    }
}