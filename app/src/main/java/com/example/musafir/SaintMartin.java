package com.example.musafir;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaintMartin extends AppCompatActivity {
        private Button cbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saint_martin);
        getSupportActionBar().setTitle("St Martin Tour");




        cbutton = findViewById(R.id.call);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:01686716411"));

                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(SaintMartin.this,"Please Grant Permission",Toast.LENGTH_SHORT).show();
                    requestPermission();
                }
                else{
                    startActivity(intent);
                }
            }
        });
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(SaintMartin.this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
}

