package com.example.seraf.babiarz.krzysztof.app24;

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

        TextView txtArrayValues = (TextView) findViewById(R.id.txtArrayValues);
        String oldTxtArrayValues;
        TextView txtAverageValues = (TextView) findViewById(R.id.txtAverageValue);


        int[] intArray = {2, 4, 54, 6, 7, 43, 23, 75, 7, 8, 4, 22, 89};

        for (int i = 0; i < intArray.length; i++){

            oldTxtArrayValues = txtArrayValues.getText().toString();
            txtArrayValues.setText(oldTxtArrayValues + intArray[i] + "    ");

        }

        //txtAverageValues.setText(getTheAverageValue(intArray) + "");
        
        txtAverageValues.setText(getTheAverageValue(2, 4, 6, 5, 9, 10) + "");

    }

    public int getTheAverageValue(int... numbers){

        int totalValue = 0;
        for (int value : numbers){
            totalValue += value;
        }
        return totalValue / numbers.length;
    }
}
