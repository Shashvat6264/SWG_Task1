package com.example.swg_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.activitylistview);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTabbed();
            }
        });
        loadActivities();


    }

    private void loadActivities(){
        List<SWGActivity> all_activities = new ArrayList<SWGActivity>();
        all_activities.add(new SWGActivity("PDS Doubt Session", "Learn PDS", R.drawable.faq));
        all_activities.add(new SWGActivity("Mentor Mentee", "Know about your mentor", R.drawable.boss));
        all_activities.add(new SWGActivity("Study Material", "Get resources to study", R.drawable.onlinebook));
        all_activities.add(new SWGActivity("Know Your Department", "Learn More about your department", R.drawable.dep));
        ActivityAdapter activityAdapter = new ActivityAdapter(getApplicationContext(), all_activities);
        listView.setAdapter(activityAdapter);
    }

    private void openTabbed(){
        Intent intent = new Intent(MainActivity.this, PDS.class);
        startActivity(intent);
    }
}