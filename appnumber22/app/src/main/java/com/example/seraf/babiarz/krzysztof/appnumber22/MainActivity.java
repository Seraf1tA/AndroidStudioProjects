package com.example.seraf.babiarz.krzysztof.appnumber22;

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

        /* Casting */
        TextView txtIntArray1 = (TextView) findViewById(R.id.txtArray1);
        TextView txtIntArray2 = (TextView) findViewById(R.id.txtArray2);

        int[][] intArray1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12},
                {13, 14, 15}, {16, 17, 18}, {19, 20, 21}, {22, 23, 24}};

        int[][] intArray2 = {{100, 101, 102}, {103, 104, 105}, {106, 107, 108}, {109, 110, 111},
                {112, 113, 114, 115, 116, 117}, {118, 119, 120}};

        letsOutputTheArrayToTheScreen(intArray1, txtIntArray1);
        letsOutputTheArrayToTheScreen(intArray2, txtIntArray2);

    }

    /*
    * This method takes two arguments : First is MultiDimensional Array type intiger
    * Second is type TextView with name textView
    */
    public void letsOutputTheArrayToTheScreen(int[][] intArray, TextView textView){

        /* Declaring object without instantiation */
        String oldColumnsValue;

        for (int row = 0; row < intArray.length; row++){

            for (int column = 0; column < intArray.length; column++){

                oldColumnsValue = textView.getText().toString();
                textView.setText(oldColumnsValue + intArray[row][column] + " - ");

            }

        }

    }
}
