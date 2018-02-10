package com.example.seraf.babiarz.krzysztof.appnumber6;

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

        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final EditText edtNumber = (EditText) findViewById(R.id.edtNumber);
        Button btnResult = (Button) findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtFieldValue = edtNumber.getText().toString();
                int intValue = Integer.parseInt(txtFieldValue);

                // if string is created there's no need for txtResult later
                String result = "";

                /*
                if (txtFieldValue.contains("51")){

                    //txtResult.setText(txtFieldValue + "Great");
                    result = txtFieldValue + "Great";


                }else {

                    //txtResult.setText("The value is not 51, And the value is: " + txtFieldValue);
                    result = "The value is not 51, And the value is: " + txtFieldValue;

                }
                */

                /*
                if (txtFieldValue.contains("90")){
                    result = "Your Grade is A and your number is: " + txtFieldValue;
                }else if (txtFieldValue.contains("80")){
                     result = "Your grade is B and your number is: " + txtFieldValue;
                }else if (txtFieldValue.contains("70")){
                    result = "Your grade is C and your number is: " + txtFieldValue;
                }else if (txtFieldValue.contains("60")){
                    result = "Your grade is F and your number is: " + txtFieldValue;
                }else {
                    result = "You are not sufficient";
                }
                */

                if (intValue > 90){
                    result = "Your Grade is A and your number is: " + intValue;
                }else if (intValue > 80){
                    result = "Your grade is B and your number is: " + intValue;
                }else if (intValue > 70){
                    result = "Your grade is C and your number is: " + intValue;
                }else if (intValue > 60){
                    result = "Your grade is F and your number is: " + intValue;
                }else {
                    result = "You are not accepted";
                }

                txtResult.setText(result);

            }
        });


    }


}
