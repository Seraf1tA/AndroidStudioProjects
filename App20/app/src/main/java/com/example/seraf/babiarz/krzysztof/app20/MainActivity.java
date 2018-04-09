package com.example.seraf.babiarz.krzysztof.app20;

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

    TextView txtModifyElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtOriginalValuesOfTheArray = (TextView) findViewById(R.id.txtOriginalValuesOfTheArray);
        TextView txtValuesAfterModification = (TextView) findViewById(R.id.txtValuesAfterModification);
        TextView txtOriginalElement = (TextView) findViewById(R.id.txtOriginalElement);
        txtModifyElement = (TextView) findViewById(R.id.txtModifyElement);
        TextView txtValueOfArrayElementAfterModification = (TextView) findViewById(R.id.txtValueOfArrayElementAfterModification);

        String[] stringArray = {"A\n", "B\n", "C\n", "D\n", "E\n", "F\n", "G\n", "H\n", "I\n", "J\n", "K\n",
                "L\n", "M\n", "N\n", "O\n", "P\n", "Q\n", "R\n", "S\n", "T\n", "U\n", "V\n", "W\n",
                "X\n", "Y\n", "Z\n" };

        String totalOriginalValues = "";

        /*enchance for loop: type String name value, witch go trough stringArray array and
        * it will assign all values to totalOriginalValues*/
        for (String value : stringArray){
            totalOriginalValues += value;
            //totalOriginalValues = totalOriginalValues + value;
        }

        txtOriginalValuesOfTheArray.setText(totalOriginalValues);

        // Now we modify array

        letsModifyArray(stringArray);

        String totalModifiedValues = "";

        for (String value : stringArray){
            totalModifiedValues += value;
        }

        txtValuesAfterModification.setText(totalModifiedValues);

        txtOriginalElement.setText(stringArray[5]);

        letsModifyElement(stringArray[5]);

        txtValueOfArrayElementAfterModification.setText(stringArray[5]);

    }

    /*this change element and it will never read as it was from start*/
    public void letsModifyArray(String[] array){

        for (int i = 0; i < array.length; i++){
            array[i] = "$" + array[i];
        }

    }

    /*this create coppy so original in array is not changed*/
    public void letsModifyElement(String element){

        element = "@#" + element;
        txtModifyElement.setText(element);

    }

}
