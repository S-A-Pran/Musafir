package com.example.musafir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context)
    {
        this.context=context;
    }

    public int[] slide_images = {

            R.drawable.chose,
            R.drawable.register_logo,
            R.drawable.tours
    };

    public String[] slide_headings = {

            "Choose",
            "Register",
            "Enjoy"
    };

    public String[] slide_descs = {

            "Here you can view all the details about the famous places around the world. Which contains the cost deatails,schedule details,seasonal best places and so on.",
            "Resgister yourself for having the opportunity to get amazing tour packages in a very interesting cost.",
            "Get ready for your journey.Enjoy your valuable time. your satisfaction is out dream."
    };



    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = view.findViewById(R.id.slideimage);
        TextView slideHeading = view.findViewById(R.id.heading);
        TextView slideDetails = view.findViewById(R.id.detail);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDetails.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object){

        container.removeView((LinearLayout)object);

    }




}
