package com.example.seraf.babiarz.krzysztof.appnum12;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

        /*
        int[] integerNumbers = new int[100];

        integerNumbers[0] = 24;

        Log.i("LOG", integerNumbers[0] + "");
        Log.i("LOG", integerNumbers[1] + "");

        integerNumbers[1] = 50;

        Log.i("LOG", "This is the Value that is inside of the index 1 of integerNumbers Array " + integerNumbers[1]);
        */

        /*
        * String class array
        * [] can be use after class name or a name
        */

        /*
        String[] stringValues = {"Animal", "Home", "Table"};

        for (int index = 0; index < stringValues.length; index++){
            Log.i("LOG", "Index number :" + index + "The value what is inside of that index: "
                    + index + "is: " + stringValues[index]);
        }

        Log.i("LOG", stringValues.length + "");
        Log.i("LOG", stringValues[2]);
        */

        TextView txtIndex = (TextView) findViewById(R.id.txtIndex);
        TextView txtValue = (TextView) findViewById(R.id.txtValue);

        String oldTxtIndexValue;
        String oldTxtValueValue;

        int[] intArray = new int[10];

        intArray[5] = 27;

        for (int counter = 0; counter < intArray.length; counter++){

            oldTxtIndexValue = txtIndex.getText().toString();
            oldTxtValueValue = txtValue.getText().toString();

            txtIndex.setText(oldTxtIndexValue + counter + "\n");
            txtValue.setText(oldTxtValueValue + intArray[counter] + "\n");
        }

    }

}
