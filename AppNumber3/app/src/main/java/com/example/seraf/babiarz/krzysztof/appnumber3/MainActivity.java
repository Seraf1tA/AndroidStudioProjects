package com.example.seraf.babiarz.krzysztof.appnumber3;

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

        // After creating objects in design content_main we have to add them

        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
        TextView txt4 = (TextView) findViewById(R.id.txt4);
        TextView txt5 = (TextView) findViewById(R.id.txt5);

        /*
        String myStringValue = "Android Programing is Fun!";
        txt1.setText(myStringValue);

        // need to be converted to string or it will crash because it needs string not character
        // + "" <- convert to string
        txt2.setText(myStringValue.charAt(0) + "");

        // will start from index number 2
        txt3.setText(myStringValue.substring(2));

        // will start from index 5 and finish after 8
        txt4.setText(myStringValue.substring(5,9));

        txt5.setText(myStringValue.indexOf("!") + "");
        */

        // Casting

        /*
        byte smallIntValue = 25; // -128 ... 128
        int intValue = (int) smallIntValue;

        float floatValue = 7.8f;

        int myIntegerNumber = (int) floatValue;

        txt1.setText(floatValue + "");
        txt2.setText(myIntegerNumber + "");
        txt3.setText(floatValue + "");
        */

        float myFirstFloatNumber = 3.9f;
        float mySecondFloatNumber = 15.8f;

        int resault = (int) (myFirstFloatNumber * mySecondFloatNumber);

        txt1.setText(myFirstFloatNumber + "");
        txt2.setText(mySecondFloatNumber + "");
        txt3.setText(resault + "");

        int myValue = (int) (2.7 * 5);
        txt4.setText(myValue + "");

        int firstIntValue = 10;
        int secondIntValue = 20;
        float floatResault = firstIntValue * secondIntValue;

        txt5.setText(floatResault + "");


    }

}
