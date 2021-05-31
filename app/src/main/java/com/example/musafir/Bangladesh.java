package com.example.musafir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bangladesh extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);
        getSupportActionBar().setTitle("Bangladesh");

        String[] name = {"Dhaka","Cox's Bazar","Kishoreganj","Kuakata","Chittagong", "kustia","Chadpur","Comilla","Barishal","Bandarban","Jashore","Sunamganj","Khagrachori","Rangamayti","Sylhet","Pabna","Sirajganj"};

        listView = findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Fragment frag;
        if(i==0){
            frag = new DhakaFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==1)
        {
            frag = new CoxFrag();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==2)
        {
            frag = new Kishoreganj();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==3)
        {
            frag = new Kuakata();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==4)
        {
            frag = new Chittagong();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==5)
        {
            frag = new Kustia();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==6)
        {
            frag = new Chadpur();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==7)
        {
            frag = new Comilla();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==8)
        {
            frag = new Barishal();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==9)
        {
            frag = new Bandarban();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==10)
        {
            frag = new Jashore();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==11)
        {
            frag = new Sunamganj();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==12)
        {
            frag = new Khagrachori();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==13)
        {
            frag = new Rangamati();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==14)
        {
            frag = new Sylhet();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==15)
        {
            frag = new Pabna();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }
        else if(i==16)
        {
            frag = new Sirajganj();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment,frag);
            fragmentTransaction.commit();
        }

    }
}
