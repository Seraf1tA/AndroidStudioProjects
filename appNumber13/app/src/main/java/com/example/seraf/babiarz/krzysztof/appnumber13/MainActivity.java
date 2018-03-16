package com.example.seraf.babiarz.krzysztof.appnumber13;

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


        TextView txtIndex = (TextView) findViewById(R.id.txtIndex);
        TextView txtValue = (TextView) findViewById(R.id.txtValue);
        String oldTxtIndexValue;
        String oldTxtValueValue;

        final int LENGHT_OF_ARRAY = 15;
        float[] floatNumbersArray = new float[LENGHT_OF_ARRAY];

        for (int index = 0; index < floatNumbersArray.length; index ++){

            /* index * 3 + 5 */
            floatNumbersArray[index] = 5 + 3 * index;

        }

        for (int index = 0; index < floatNumbersArray.length; index++){

            oldTxtIndexValue = txtIndex.getText().toString();
            oldTxtValueValue = txtValue.getText().toString();

            /* This will output index*/
            txtIndex.setText(oldTxtIndexValue + index + "\n");
            /* This will output value it this specific index*/
            txtValue.setText(oldTxtValueValue + floatNumbersArray[index] + "\n");

        }

    }


}
