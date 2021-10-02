package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Button;
import android.content.Intent;
import java.util.ArrayList;

public class reccomendedrestaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reccomendedrestaurants);
        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> reccos = new ArrayList<String>();
        reccos.add("xyz");
        reccos.add("abc");
        reccos.add("sals pizzaa");
        reccos.add("pasta and wine");
        reccos.add("basho");
        reccos.add("panda express");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, reccos);
        myListView.setAdapter(arrayAdapter);




    }
}