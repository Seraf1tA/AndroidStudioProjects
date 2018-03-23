package com.example.seraf.babiarz.krzysztof.appnumber14;

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

        TextView txtTotal = (TextView) findViewById(R.id.txtTotal);
        TextView txtCalculations = (TextView) findViewById(R.id.txtCalculations);

        String oldText;

        int[] intigerArray = {2, 54, 34, 76, 23, 4, 7, 86, 4, 65};
        int totalValue = 0;

        for (int index = 0; index < intigerArray.length; index ++){

            // Two ways how to output this

            // totalValue = totalValue + intigerArray[index];
            // totalValue += intigerArray[index];

            // assigning txtCalculations to oldText String

            oldText = txtCalculations.getText().toString();

            /*
            * At begining totalValue is 0 so old text is set to 0 + array sub index so 0 + 2
            * old text is 2 now then 2 + 54 so now is 56 and so on
            * intigerArray[index] <- index refer to sub index in array with change depending on
            * what it is in array
            */
            txtCalculations.setText(oldText + totalValue + "+" + intigerArray[index] + "="
                + (totalValue += intigerArray[index]) + "\n");

        }

        // show total value of array with is 355
        txtTotal.setText(totalValue + "");


    }


}
