package com.bebala.bebala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dialeko extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialeko);
    }
    public void sejarahlampungo(View view) {
        // Start the  activity
        Intent tampil = new Intent(this, sejarah_o.class);
        startActivity(tampil);
    }
}

