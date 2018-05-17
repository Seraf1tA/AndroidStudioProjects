package com.example.seraf.babiarz.krzysztof.planer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;


import android.os.Bundle;

public class MainActivity extends Activity {

    TextView txtDate;

    //TextView txtMon, txtTue, txtWed, txtThu, txtFri, txtSat, txtSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<String>();

        //txtDate = (TextView) findViewById(R.id.txtDate);

        //Calendar calendar = Calendar.getInstance();
        //String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        //txtDate.setText(currentDate);


    }


}

