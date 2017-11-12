package com.bebala.bebala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registrasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
    }
    public void login(View view) {
        // Start the  activity
        Intent tampil = new Intent(this,registrasi.class);
        startActivity(tampil);
    }

    public void linkdaftar(View view) {
        Intent tampil = new Intent(this,login.class);
        startActivity(tampil);
    }
}
