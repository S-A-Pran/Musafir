package com.example.musafir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        final EditText edit1 = findViewById(R.id.edit1);
        final EditText edit2 = findViewById(R.id.edit2);
        Button btn = findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL,new String("msabbir081@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT,new String("Feedback From App"));
                i.putExtra(Intent.EXTRA_TEXT,"Name:"+edit1.getText()+"\n Message:"+edit2.getText());
                try{
                    startActivity(Intent.createChooser(i,"Please select Email"));
                }
                catch (android.content.ActivityNotFoundException e)
                {
                    Toast.makeText(Feedback.this,"There are no email clients",Toast.LENGTH_SHORT).show();
                }
            }
        });








    }
}
