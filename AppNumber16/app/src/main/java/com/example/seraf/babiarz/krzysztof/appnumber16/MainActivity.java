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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtDice1 = (TextView) findViewById(R.id.txtDice1);
        TextView txtDice2 = (TextView) findViewById(R.id.txtDice2);
        TextView txtDice3 = (TextView) findViewById(R.id.txtDice3);
        TextView txtDice4 = (TextView) findViewById(R.id.txtDice4);
        TextView txtDice5 = (TextView) findViewById(R.id.txtDice5);
        TextView txtDice6 = (TextView) findViewById(R.id.txtDice6);

        /*
        ImageView imgDice1 = (ImageView) findViewById(R.id.imgDice1);
        ImageView imgDice2 = (ImageView) findViewById(R.id.imgDice2);
        ImageView imgDice3 = (ImageView) findViewById(R.id.imgDice3);
        ImageView imgDice4 = (ImageView) findViewById(R.id.imgDice4);
        ImageView imgDice5 = (ImageView) findViewById(R.id.imgDice5);
        ImageView imgDice6 = (ImageView) findViewById(R.id.imgDice6);
        */

        Button btnRollDice = (Button) findViewById(R.id.btnRollDice);

        SecureRandom secRand = new SecureRandom();


    }


}
