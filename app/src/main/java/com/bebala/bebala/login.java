package com.bebala.bebala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {
        // Start the  activity
        Intent tampil = new Intent(this,beranda.class);

        startActivity(tampil);

    }

    public void linkdaftar(View view) {
        Intent tampil = new Intent(this,registrasi.class);
        startActivity(tampil);
    }
}