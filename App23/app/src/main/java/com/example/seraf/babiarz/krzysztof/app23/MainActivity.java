package com.example.seraf.babiarz.krzysztof.app23;

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

        TextView txtGameName = (TextView) findViewById(R.id.txtGameName);
        TextView txtGameScores = (TextView) findViewById(R.id.txtGameScores);
        TextView txtLowestScore = (TextView) findViewById(R.id.txtLowestScore);
        TextView txtHighestScore = (TextView) findViewById(R.id.txtHighestScore);
        TextView txtAverageScore = (TextView) findViewById(R.id.txtAverageScore);


        int[][] gameScoresArray = {{45, 67, 34},
                {23, 56, 49},
                {23, 69, 88},
                {17, 28, 84},
                {38, 54, 75},
                {51, 34, 71},
                {15, 83, 46},
                {36, 47, 15},
                {83, 94, 34},
                {17, 37, 0}
        };

        /*
        * Creating new object and instantiate
        * constructor in Game class is called and he take two arguments
        * String gameName and two-dimentional array type int
        * with is created here
        */
        Game myGame = new Game("God of War", gameScoresArray);

        /*
        * get and set gameName
        */
        txtGameName.setText(myGame.getGameName());

        myGame.letsOutPutToScreen(txtGameScores);
        txtHighestScore.setText(myGame.getMaximumScore() + "");
        txtLowestScore.setText(myGame.getMinimumScore() + "");

        String oldTxtAverageValueOfScores;

        for (int gameIndex = 0; gameIndex< gameScoresArray.length; gameIndex++){

            oldTxtAverageValueOfScores = txtAverageScore.getText().toString() + gameIndex + " - ";

            double averageValue = myGame.getTheAverageScores(gameScoresArray[gameIndex]);
            txtAverageScore.setText(oldTxtAverageValueOfScores + averageValue + "\n");

        }

    }

}
