package com.example.seraf.babiarz.krzysztof.appnumber4;

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

        TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        TextView txtCat = (TextView) findViewById(R.id.txtCat);
        TextView txtLion = (TextView) findViewById(R.id.txtLion);
        TextView txtLeopard = (TextView) findViewById(R.id.txtLeopard);
        TextView txtBird = (TextView) findViewById(R.id.txtBird);

        Animal animal1 = new Animal("tiger", "orange", 60, 80);
        txtAnimal.setText(animal1.toString());



    }


}
