package com.example.seraf.babiarz.krzysztof.appnumber16;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtDice1 = (TextView) findViewById(R.id.txtDice1);
        final TextView txtDice2 = (TextView) findViewById(R.id.txtDice2);
        final TextView txtDice3 = (TextView) findViewById(R.id.txtDice3);
        final TextView txtDice4 = (TextView) findViewById(R.id.txtDice4);
        final TextView txtDice5 = (TextView) findViewById(R.id.txtDice5);
        final TextView txtDice6 = (TextView) findViewById(R.id.txtDice6);


        ImageView imgDice1 = (ImageView) findViewById(R.id.imgDice1);
        ImageView imgDice2 = (ImageView) findViewById(R.id.imgDice2);
        ImageView imgDice3 = (ImageView) findViewById(R.id.imgDice3);
        ImageView imgDice4 = (ImageView) findViewById(R.id.imgDice4);
        ImageView imgDice5 = (ImageView) findViewById(R.id.imgDice5);
        ImageView imgDice6 = (ImageView) findViewById(R.id.imgDice6);


        Button btnRollDice = (Button) findViewById(R.id.btnRollDice);

        final SecureRandom secRand = new SecureRandom();

        final int[] occurence = new int[7];

        btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (firstTime){
                    for(int times = 0; times < 500000; times++){

                        int rendNum = 1 + secRand.nextInt(6);
                        ++occurence[rendNum];

                    }

                    for (int faceNum = 1; faceNum < occurence.length; faceNum++){

                    /*
                    if (faceNum == 1){
                        txtDice1.setText(occurence[faceNum] + "");
                    }else if (faceNum == 2){
                        txtDice2.setText(occurence[faceNum] + "");
                    }else if (faceNum == 3){
                        txtDice3.setText(occurence[faceNum] + "");
                    }else if (faceNum == 4){
                        txtDice4.setText(occurence[faceNum] + "");
                    }else if (faceNum == 5){
                        txtDice5.setText(occurence[faceNum] + "");
                    }else if (faceNum == 6){
                        txtDice6.setText(occurence[faceNum] + "");
                    }
                    */

                    /*
                    switch (faceNum){

                        case 1:
                            txtDice1.setText(occurence[faceNum] + "");
                        case 2:
                            txtDice2.setText(occurence[faceNum] + "");
                        case 3:
                            txtDice3.setText(occurence[faceNum] + "");
                        case 4:
                            txtDice4.setText(occurence[faceNum] + "");
                        case 5:
                            txtDice5.setText(occurence[faceNum] + "");
                        case 6:
                            txtDice6.setText(occurence[faceNum] + "");

                    }
                    */

                        switch (faceNum){

                            case 1:
                                putTheRightValue(txtDice1, occurence, faceNum);
                                break;
                            case 2:
                                putTheRightValue(txtDice2, occurence, faceNum);
                                break;
                            case 3:
                                putTheRightValue(txtDice3, occurence, faceNum);
                                break;
                            case 4:
                                putTheRightValue(txtDice4, occurence, faceNum);
                                break;
                            case 5:
                                putTheRightValue(txtDice5, occurence, faceNum);
                                break;
                            case 6:
                                putTheRightValue(txtDice6, occurence, faceNum);
                                break;

                        }

                    }
                    firstTime = false;
                }
            }
        });


    }


    private void putTheRightValue(TextView txtDiceNumber, int[] occurance, int index){

        txtDiceNumber.setText(occurance[index] + "");

    }

}
