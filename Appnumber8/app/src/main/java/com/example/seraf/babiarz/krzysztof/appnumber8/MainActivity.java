package com.example.seraf.babiarz.krzysztof.appnumber8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtHealthy = (TextView) findViewById(R.id.txtHealthy);
        final CheckBox chxHealthyYes = (CheckBox) findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo = (CheckBox) findViewById(R.id.chxHealthyNo);

        chxHealthyYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyYes.isChecked()){

                    chxHealthyNo.setChecked(false);
                }

            }
        });

        chxHealthyNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyNo.isChecked()){
                    chxHealthyYes.setChecked(false);
                }

            }
        });

        boolean amIHealthy = false;

        int power = 70;

        /*
        if (amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
        */

        /*
        amIHealthy = (power > 70);

        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
        */


        // if power variable is greater then 70 do true if not do false
        amIHealthy = (power > 70 ? true : false);

        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }


    }


}
