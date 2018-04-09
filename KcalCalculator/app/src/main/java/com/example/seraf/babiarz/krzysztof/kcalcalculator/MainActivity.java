package com.example.seraf.babiarz.krzysztof.kcalcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double sum, weight, intensity;
    private int multiplayer = 24 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText edtWeight = (EditText) findViewById(R.id.edtWeight);
        final EditText edtIntensity = (EditText) findViewById(R.id.edtIntensity);
        final EditText edtKCLA = (EditText) findViewById(R.id.edtKCLA);

        Button btnCal = (Button) findViewById(R.id.btnCal);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weight = Double.parseDouble(edtWeight.getText().toString());
                intensity = Double.parseDouble(edtIntensity.getText().toString());

                edtKCLA.setText(calculations() + "");

            }
        });
    }

    public double calculations(){

        sum = weight * multiplayer * intensity;
        return sum;

    }


}
