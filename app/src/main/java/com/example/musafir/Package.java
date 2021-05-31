package com.example.musafir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Package extends AppCompatActivity {

    private Button buttonindia;
    private Button buttonsajek;
    private Button buttonst;
    private Button buttonsl;
    private Button buttontg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);
        getSupportActionBar().setTitle("Packages");

        buttonindia = findViewById(R.id.pack1);
        buttonsajek = findViewById(R.id.pack2);
        buttonst = findViewById(R.id.pack3);
        buttonsl = findViewById(R.id.pack4);
        buttontg = findViewById(R.id.pack5);


        buttonindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Package.this,IndiaPack.class);
                startActivity(intent);
            }
        });
        buttonsajek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Package.this,Sajek_tour.class);
                startActivity(intent);
            }
        });
        buttonst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Package.this,SaintMartin.class);
                startActivity(intent);
            }
        });
        buttonsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Package.this,SylhetTour.class);
                startActivity(intent);
            }
        });
        buttontg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Package.this,Tanguar.class);
                startActivity(intent);
            }
        });

    }
}
