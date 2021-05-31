package com.example.musafir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Chose extends AppCompatActivity {
    private Button buttonbd;
    private Button buttonab;
    private Button buttonvd;
    private Button buttontp;
    private Button buttonreg;
    private ImageButton buttonfb;
    private ImageButton buttonin;
    private ImageButton buttonyu;
    private ImageButton buttontw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);

        buttonbd = findViewById(R.id.bdbutton);
        buttonab = findViewById(R.id.abbutton);
        buttonvd = findViewById(R.id.vdbutton);
        buttontp = findViewById(R.id.tpbutton);
        buttonfb = findViewById(R.id.fbbutton);
        buttonin = findViewById(R.id.inbutton);
        buttonyu = findViewById(R.id.yubutton);
        buttontw = findViewById(R.id.twbutton);
        buttonreg = findViewById(R.id.register);


        buttonfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Facebook.class);
                startActivity(intent);
            }
        });
        buttonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Instagram.class);
                startActivity(intent);
            }
        });

        buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Register.class);
                startActivity(intent);
            }
        });


        buttonbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Bangladesh.class);
                startActivity(intent);
            }
        });

        buttonab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Abroad.class);
                startActivity(intent);
            }
        });

        buttontp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Package.class);
                startActivity(intent);
            }
        });

        buttonyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Youtube.class);
                startActivity(intent);
            }
        });

        buttontw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Tweeter.class);
                startActivity(intent);
            }
        });
        buttonvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chose.this, Video.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menue_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.share) {
            Intent intent = new Intent((Intent.ACTION_SEND));
            intent.setType("text/plain");
            String shareBody = "msabbir081@gmail.com";
            String subject = "Your subject is here";

            intent.putExtra(Intent.EXTRA_TEXT,shareBody);
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);

            startActivity(Intent.createChooser(intent,"Share using"));
        }
        if (item.getItemId() == R.id.feedback) {
            Intent intent = new Intent(Chose.this, Feedback.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(Chose.this, About.class);
            startActivity(intent);

        }
        if (item.getItemId() == R.id.login) {
            Intent intent = new Intent(Chose.this, Login.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.support) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:01686716411"));

            if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Chose.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                requestPermission();
            } else {
                startActivity(intent);
            }
        }

        return true;
    }
    private void requestPermission() {
        ActivityCompat.requestPermissions(Chose.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
}
