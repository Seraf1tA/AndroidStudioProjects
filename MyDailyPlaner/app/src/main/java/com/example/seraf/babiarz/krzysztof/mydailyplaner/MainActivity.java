package com.example.seraf.babiarz.krzysztof.mydailyplaner;

import android.app.ActivityGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends ActivityGroup{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());

        //tab 1
        // crating new tab
        TabHost.TabSpec spec = tabHost.newTabSpec("One");
        spec.setIndicator("Calendar");
        // Intent alow to move from main activity to calendar activity
        Intent intent1 = new Intent(MainActivity.this, CalendarActivity.class);
        spec.setContent(intent1);
        tabHost.addTab(spec);

        //tab 2
        spec = tabHost.newTabSpec("Two");
        spec.setIndicator("Planer");
        Intent intent2 = new Intent(MainActivity.this, PlanerActivity.class);
        spec.setContent(intent2);
        tabHost.addTab(spec);
    }
}
