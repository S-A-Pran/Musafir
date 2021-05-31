package com.example.musafir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Abroad extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad);
        getSupportActionBar().setTitle("Abroad");

        String[] name1 = {"Singapore","Malwasia","India","Vhutan","Nepal","Thailand"};

        listView1 = findViewById(R.id.listview1);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,name1);
        listView1.setAdapter(adapter1);

        listView1.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Fragment frag1;
        if(i==0){
            frag1 = new Singapore();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }
        else if(i==1)
        {
            frag1 = new Malwasia();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }
        else if(i==2)
        {
            frag1 = new India();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }
        else if(i==3)
        {
            frag1 = new Vhutan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }
        else if(i==4)
        {
            frag1 = new Nepal();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }
        else if(i==5)
        {
            frag1 = new Thailand();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,frag1);
            fragmentTransaction.commit();
        }

    }


}
