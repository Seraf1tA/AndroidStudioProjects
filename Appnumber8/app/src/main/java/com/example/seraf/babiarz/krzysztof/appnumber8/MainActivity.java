package com.example.seraf.babiarz.krzysztof.appnumber8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtHealthy = (TextView) findViewById(R.id.txtHealthy);
        final CheckBox chxHealthyYes = (CheckBox) findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo = (CheckBox) findViewById(R.id.chxHealthyNo);

        // True and True
        TextView txtTrueAndTrue = (TextView) findViewById(R.id.txtTrueAndTrue);
        final CheckBox chxTrueAndTrueYes = (CheckBox) findViewById(R.id.chxTrueAndTrueYes);
        final CheckBox chxTrueAndTrueNo = (CheckBox) findViewById(R.id.chxTrueAndTrueNo);

        //True and False
        TextView txtTrueAndFalse = (TextView) findViewById(R.id.txtTrueAndFalse);
        final CheckBox chxTrueAndFalseYes = (CheckBox) findViewById(R.id.chxTrueAndFalseYes);
        final CheckBox chxTrueAndFalseNo = (CheckBox) findViewById(R.id.chxTrueAndFalseNo);

        //False and True

        TextView txtFalseAndTrue = (TextView) findViewById(R.id.txtFalseAndTrue);
        final CheckBox chxFalseAndTrueYes = (CheckBox) findViewById(R.id.chxFalseAndTrueYes);
        final CheckBox chxFalseAndTrueNo = (CheckBox) findViewById(R.id.chxFalseAndTrueNo);

        //False and False
        TextView txtFalseAndFalse = (TextView) findViewById(R.id.txtFalseAndFalse);
        final CheckBox chxFalseAndFalseYes = (CheckBox) findViewById(R.id.chxFalseAndFalseYes);
        final CheckBox chxFalseAndFalseNo = (CheckBox) findViewById(R.id.chxFalseAndFalseNo);

        //True Or True
        TextView txtTrueOrTrue = (TextView) findViewById(R.id.txtTrueOrTrue);
        final CheckBox chxTrueOrTrueYes = (CheckBox) findViewById(R.id.chxTrueOrTrueYes);
        final CheckBox chxTrueOrTrueNo = (CheckBox) findViewById(R.id.chxTrueOrTrueNo);

        //True Or False
        TextView txtTrueOrFalse = (TextView) findViewById(R.id.txtTrueOrFalse);
        final CheckBox chxTrueOrFalseYes = (CheckBox) findViewById(R.id.chxTrueOrFalseYes);
        final CheckBox chxTrueOrFalseNo = (CheckBox) findViewById(R.id.chxTrueOrFalseNo);

        //False Or True
        TextView txtFalseOrTrue = (TextView) findViewById(R.id.txtFalseOrTrue);
        final CheckBox chxFalseOrTrueYes = (CheckBox) findViewById(R.id.chxFalseOrTrueYes);
        final CheckBox chxFalseOrTrueNo = (CheckBox) findViewById(R.id.chxFalseOrTrueNo);

        // On Click Listener for manual changing
        chxHealthyYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyYes.isChecked()){

                    chxHealthyNo.setChecked(false);
                }

            }
        });

        chxHealthyNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyNo.isChecked()){
                    chxHealthyYes.setChecked(false);
                }

            }
        });


        boolean amIHealthy = false;

        int power = 9000;



        amIHealthy = (power > 90);

        chxHealthyYes.setChecked((amIHealthy ? true : false));
        chxHealthyNo.setChecked((!amIHealthy ? true : false));

        // True and True

        boolean trueAndTrue = (true && true);

        /*
        if(trueAndTrue){
            chxTrueAndTrueYes.setChecked(true);
        }else if(!trueAndTrue){
            chxTrueAndTrueNo.setChecked(true);
        }
        */


        //other way to write this with boolean expresion

        chxTrueAndTrueYes.setChecked((trueAndTrue ? true : false));
        chxTrueAndTrueNo.setChecked((!trueAndTrue ? true : false));


        // True and False

        boolean trueAndFalse = (true && false);

        /*
        if(trueAndFalse){
            chxTrueAndFalseYes.setChecked(true);
        }else if(!trueAndFalse){
            chxTrueAndFalseNo.setChecked(true);
        }
        */

        chxTrueAndFalseYes.setChecked((trueAndFalse ? true : false));
        chxTrueAndFalseNo.setChecked((!trueAndFalse ? true : false));

        // False and True

        boolean falseAndTrue = (false && true);

        /*
        if (falseAndTrue){
            chxFalseAndTrueYes.setChecked(true);
        }else if(!falseAndTrue){
            chxFalseAndTrueNo.setChecked(true);
        }
        */

        chxFalseAndTrueYes.setChecked((falseAndTrue ? true : false));
        chxFalseAndTrueNo.setChecked((!falseAndTrue ? true : false));

        // False and False

        boolean falseAndFalse = (false && false);

        /*
        if(falseAndFalse){
            chxFalseAndFalseYes.setChecked(true);
        }else if(!falseAndFalse){
            chxFalseAndFalseNo.setChecked(true);
        }
        */

        chxFalseAndFalseYes.setChecked((falseAndFalse ? true : false));
        chxFalseAndFalseNo.setChecked((!falseAndFalse ? true : false));

        // True Or True

        boolean trueOrTrue = (true || true);

        /*
        if(trueOrTrue){
            chxTrueOrTrueYes.setChecked(true);
        }else if(!trueOrTrue){
            chxTrueOrTrueNo.setChecked(true);
        }
        */

        chxTrueOrTrueYes.setChecked((trueOrTrue ? true : false));
        chxTrueOrTrueNo.setChecked((!trueOrTrue ? true : false));

        //True Or False

        boolean trueOrFalse = (true || false);

        /*
        if(trueOrFalse){
            chxTrueOrFalseYes.setChecked(true);
        }else if(!trueOrFalse){
            chxTrueOrFalseNo.setChecked(true);
        }
        */

        chxTrueOrFalseYes.setChecked((trueOrFalse ? true : false));
        chxTrueOrFalseNo.setChecked((!trueOrFalse ? true : false));

        //False Or True

        boolean falseOrTrue = (false || true);

        if (falseOrTrue){
            chxFalseOrTrueYes.setChecked(true);
        }else if(!falseOrTrue){
            chxFalseOrTrueNo.setChecked(true);
        }


    }


}

/*
        if (amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
        */

        /*
        amIHealthy = (power > 70);

        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
        */


// if power variable is greater then 70 do true if not do false

//amIHealthy = (power > 70 ? true : false);

        /*
        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
        */


        /*
         this way we can do boolean expression

         and it will give both yes and no checked in program

         this will check yes button
        */


        /*
        chxHealthyYes.setChecked((power > 80 ? true : false));
         */

        /*
        this will check no button
        with powar set to 90
        (power > 80 ? true : false)
        but with this it will just stay with yes option
        */

        /*
        chxHealthyNo.setChecked((power < 80 ? true : false));
         */
