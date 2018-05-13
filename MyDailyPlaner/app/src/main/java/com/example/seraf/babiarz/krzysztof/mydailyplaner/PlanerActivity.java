package com.example.seraf.babiarz.krzysztof.mydailyplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class PlanerActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnbtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planer);

        btnbtc = (Button) findViewById(R.id.btnbtc);

        btnbtc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent2 = new Intent();
        intent2.setClass(this, CalendarActivity.class);

        startActivity(intent2);

    }
}
