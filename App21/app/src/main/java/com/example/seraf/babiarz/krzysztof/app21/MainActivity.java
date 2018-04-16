package com.example.seraf.babiarz.krzysztof.app21;

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

        TextView txtSportName = (TextView) findViewById(R.id.txtSportName);
        TextView txtScores = (TextView) findViewById(R.id.txtScores);
        TextView txtScoresAverage = (TextView) findViewById(R.id.txtScoresAverage);
        TextView txtHighestScore = (TextView) findViewById(R.id.txtHighestScore);
        TextView txtLowestScore = (TextView) findViewById(R.id.txtLowestScore);


        int[] scoresArray = {87, 34, 56, 23, 65, 98, 35, 21, 48, 56, 45 ,86 ,37};

        /*creating object name mySport then instanciate object by puting "new" key word
        * and then assign 2 values, first string value and then reference to array of type intiger*/
        Sport mySport = new Sport("Boxing", scoresArray);
        txtSportName.setText(mySport.getSportName());
        /*this line take scores from text view*/
        mySport.letsOutPutTheScores(txtScores);
        txtScoresAverage.setText(mySport.getTheAverageValue() + "");
        txtHighestScore.setText(mySport.getTheMaximumValue() + "");
        txtLowestScore.setText(mySport.getMinimumValue() + "");
    }

}
