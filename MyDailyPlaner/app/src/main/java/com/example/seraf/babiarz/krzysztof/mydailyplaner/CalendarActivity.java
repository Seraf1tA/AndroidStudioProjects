package com.example.seraf.babiarz.krzysztof.mydailyplaner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity implements View.OnClickListener{

    CalendarView calendarView;
    TextView txtView;
    Button btnop;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = (CalendarView) findViewById(R.id.calendarView1);
        txtView = (TextView) findViewById(R.id.txtView1);
        btnop = (Button) findViewById(R.id.btnop1);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                date = dayOfMonth + "/" + (month + 1) + "/" + year;
                txtView.setText(date);

            }
        });

        btnop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        intent.setClass(this, PlanerActivity.class);

        startActivity(intent);

    }
}
