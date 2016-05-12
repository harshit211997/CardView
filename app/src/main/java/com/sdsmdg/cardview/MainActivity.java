package com.sdsmdg.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> demo = new ArrayList<>(5);
        demo.add("harsiht");
        demo.add("vartika");
        demo.add("kishan");
        demo.add("moti");
        demo.add("fake");
        customAdapter = new CustomAdapter(this, demo);

        recyclerView.setAdapter(customAdapter);

    }
}
