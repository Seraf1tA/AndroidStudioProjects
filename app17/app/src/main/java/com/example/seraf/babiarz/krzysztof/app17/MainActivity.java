package com.example.seraf.babiarz.krzysztof.app17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView txtRates = (TextView) findViewById(R.id.txtRates);
        TextView txtNumberOfStars = (TextView) findViewById(R.id.txtNumberOfStars);

        String oldTxtRatesValue;
        String oldTxtNumberOfStars;


        int[] peopleRates = { 1, 4, 3, 5, 2, 5, 1, 3, 4, 5, 2, 4, 5, 6 };
        int[] occurance = new int[6];

        for (int respond = 0; respond < peopleRates.length; respond++){

            // ++occurance[peopleRates[respond]];

            try {

                ++occurance[peopleRates[respond]];
            // catching error in peopleRates with number 6 with is out of bounds in
            // occurance array with is from 0 to 5
            } catch (Exception e){

                Log.i("LOG", e.toString());

            }

        }

        for (int ammount = 1; ammount < occurance.length; ammount++){

            oldTxtRatesValue = txtRates.getText().toString();
            oldTxtNumberOfStars = txtNumberOfStars.getText().toString();

            txtRates.setText(oldTxtRatesValue + ammount + "\n");
            txtNumberOfStars.setText(oldTxtNumberOfStars + occurance[ammount] + "\n");

        }

    }


}
