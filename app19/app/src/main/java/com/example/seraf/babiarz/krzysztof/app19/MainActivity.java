package com.example.seraf.babiarz.krzysztof.app19;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtCountryNames = (TextView) findViewById(R.id.txtCountryNames);

        String[] countryNames = {"Poland\n", "England\n", "France\n", "Germany\n", "Algeria\n",
        "Azerbajan\n", "Bulgaria\n", "Belgium\n"};

        String allCountryNames = "";

        /*enachanced for loop*/
        for (String countryName : countryNames){

            // allCountryNames = allCountryNames + countryName;

            allCountryNames += countryName;
        }

        txtCountryNames.setText(allCountryNames);

    }

}
