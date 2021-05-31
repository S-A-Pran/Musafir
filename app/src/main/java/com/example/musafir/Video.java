package com.example.musafir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Video extends AppCompatActivity {

    private RecyclerView recyclerView;

    ArrayList<DatasetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().setTitle("Video Blogs");

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<DatasetList>();

        DatasetList datasetList = new DatasetList("https://www.youtube.com/embed/VwPhz4G9hLQ");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/2ZlMwmo88ZQ");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/yDHzqoTKAiU");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/sKSVJEk4ong");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/69AXTg5OEl8");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/noIYqD7EOP4");
        arrayList.add(datasetList);
        datasetList = new DatasetList("https://www.youtube.com/embed/2uPD_weRrCM");
        arrayList.add(datasetList);

        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);
    }
}
