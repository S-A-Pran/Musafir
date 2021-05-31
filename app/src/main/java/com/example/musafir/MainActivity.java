package com.example.musafir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewPager sview;
    private LinearLayout dotview;
    private SliderAdapter sliderAdapter;
    private TextView[] mDots;
    private Button bbutton;
    private Button nbutton;
    private int mCurrentPage;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sview = findViewById(R.id.viewpager);
        dotview = findViewById(R.id.dotlayout);
        bbutton = findViewById(R.id.button1);
        nbutton = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        sliderAdapter = new SliderAdapter(this);

        sview.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        sview.addOnPageChangeListener(viewListener);



        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sview.setCurrentItem(mCurrentPage - 1);
            }
        });

        nbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sview.setCurrentItem(mCurrentPage + 1);
                }
            });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Chose.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome!!!",Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void addDotsIndicator(int position){
        mDots = new  TextView[3];
        dotview.removeAllViews();
        for (int i=0;i<mDots.length;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(50);
            mDots[i].setTextColor(getResources().getColor(R.color.black));

            dotview.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.orange));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            mCurrentPage = i;

            if(i==0){
                nbutton.setEnabled(true);
                bbutton.setEnabled(false);
                bbutton.setVisibility(View.INVISIBLE);
                nbutton.setVisibility(View.VISIBLE);
                nbutton.setText("Next");
                bbutton.setText("");
            }else if(i==mDots.length - 1)
            {
                bbutton.setEnabled(true);
                nbutton.setEnabled(false);
                nbutton.setVisibility(View.INVISIBLE);
                nbutton.setText("");
                bbutton.setText("Back");
            }
            else {
                bbutton.setEnabled(true);
                nbutton.setEnabled(true);
                bbutton.setVisibility(View.VISIBLE);
                nbutton.setVisibility(View.VISIBLE);
                nbutton.setText("Next");
                bbutton.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };


}
