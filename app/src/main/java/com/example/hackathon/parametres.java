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

public class parametres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);
        //the list of cuisines
        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> Cuisines = new ArrayList<String>();
        Cuisines.add("chineese");
        Cuisines.add("japaneese");
        Cuisines.add("asian");
        Cuisines.add("mexican");
        Cuisines.add("indian");
        Cuisines.add("italian");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Cuisines);
        myListView.setAdapter(arrayAdapter);


        //logging the list input
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("cuisine selected: ", Cuisines.get(i));
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Openactivity2();

            }
        });





    }
    public void Openactivity2(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        }

    }