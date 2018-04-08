package com.example.seraf.babiarz.krzysztof.app18;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*instantiation*/
        EditText edtPuzzle = (EditText) findViewById(R.id.edtPuzzle);
        /*declaration*/
        String oldEdtPuzzleValue;

        Puzzle myPuzzle = new Puzzle();
        myPuzzle.letsShuffleTheDevices();

        for (int i = 0; i < 60; i++){

            oldEdtPuzzleValue = edtPuzzle.getText().toString();
            edtPuzzle.setText(oldEdtPuzzleValue + myPuzzle.giveMeTheModels());

        }

    }
}
