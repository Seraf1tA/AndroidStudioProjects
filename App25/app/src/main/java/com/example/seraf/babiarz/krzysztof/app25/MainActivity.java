package com.example.seraf.babiarz.krzysztof.app25;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtArrayDoubleValues = (TextView) findViewById(R.id.txtArrayDoubleValues);
        TextView txtArrayIntigerNumbers = (TextView) findViewById(R.id.txtArrayIntigerNumbers);
        TextView txtIntArray1 = (TextView) findViewById(R.id.txtIntArray1);
        TextView txtIntArray1Copy = (TextView) findViewById(R.id.txtIntArray1Copy);
        TextView txtLocationArrayElement = (TextView) findViewById(R.id.txtLocationArrayElement);
        Switch swtEqual = (Switch) findViewById(R.id.swtEqual);

        double[] doubleValueArray = {6.3, 1.2, 3.8, 2.7, 9.1, 4.3, 56.4, 34.2, 90.1, 12.4, 54.2, 79.1, 10.2 };

        // because of this it will move 2.7 to index 1
        Arrays.sort(doubleValueArray);
        String oldArrayDoubleValues;
        for (int i = 0; i < doubleValueArray.length; i++){
            oldArrayDoubleValues = txtArrayDoubleValues.getText().toString();
            txtArrayDoubleValues.setText(oldArrayDoubleValues + doubleValueArray[i] + "    ");
        }

        // size of array is 20
        int[] intNumbersArray = new int[20];
        // fill up array with 20 umbers 1
        Arrays.fill(intNumbersArray, 1);
        // calling method and passing int array and text view
        outputTheArrayToTheScreen(intNumbersArray, txtArrayIntigerNumbers);

        int[] integerArray1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
        // create copy
        int[] integerArray1Copy = new int[integerArray1.length];

        /*
        * first create source integerArray1, 2nd argument is starting positon
        * 3rd is destination where to copy to
        * 4th is starting position and last is length how much we want to copy
        */
        System.arraycopy(integerArray1, 0, integerArray1Copy, 0, integerArray1.length);
        outputTheArrayToTheScreen(integerArray1, txtIntArray1);
        outputTheArrayToTheScreen(integerArray1Copy, txtIntArray1Copy);

        boolean isEqual = Arrays.equals(integerArray1, integerArray1Copy);
        swtEqual.setChecked((isEqual ? true : false));
        swtEqual.setText((isEqual ? " The Values of these arrays are equal " : " not Equal "));

        int arrayElement = Arrays.binarySearch(doubleValueArray, 2.7);
        if (arrayElement >= 0){
            txtLocationArrayElement.setText(String.format("We found 2.7 at element %d" +
                    " in dounbleValuesArray", arrayElement));
        }else {
            txtLocationArrayElement.setText("Couldn't find the value in that element");
        }
    }

    public void outputTheArrayToTheScreen(int[] array, TextView textView){

        String oldTextViewValue;

        // create int number and it go trough array
        for (int number : array){
            oldTextViewValue = textView.getText().toString();
            textView.setText(oldTextViewValue + number + "       ");
        }

    }

}
