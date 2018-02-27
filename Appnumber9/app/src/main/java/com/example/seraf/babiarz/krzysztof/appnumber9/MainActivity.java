package com.example.seraf.babiarz.krzysztof.appnumber9;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
        final EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);
        final EditText edtNum3 = (EditText) findViewById(R.id.edtNum3);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        Button btnMaxValue = (Button) findViewById(R.id.btnMaxValue);
        TextView SecRandNum = (TextView) findViewById(R.id.SecRandNum);
        Button btnSecRandNum = (Button) findViewById(R.id.btnSecRandNum);

        btnMaxValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //converting string to double
                double num1 = Double.parseDouble(edtNum1.getText().toString());
                double num2 = Double.parseDouble(edtNum2.getText().toString());
                double num3 = Double.parseDouble(edtNum3.getText().toString());

                double result = getTheMaximum(num1, num2, num3);
                txtResult.setText(result + "");

            }
        });


    }

    public double getTheMaximum(double num1, double num2 , double num3){

        double theMaximumValue = num1;
        if (num2 > theMaximumValue){
            theMaximumValue = num2;
        }
        if (num3 > theMaximumValue){
            theMaximumValue = num3;
        }
        return theMaximumValue;
    }

}
