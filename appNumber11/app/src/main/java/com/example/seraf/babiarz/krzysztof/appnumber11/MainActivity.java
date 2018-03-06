package com.example.seraf.babiarz.krzysztof.appnumber11;

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

    /*
    * Access modifier private object and
    * Creating a reference to this object in memory
    */
    private static final SecureRandom secRandNumb = new SecureRandom();

    /*
    * Letters in enum must be capital
    * name of enum Status is it's own type
    * when declering enum we define types in project
    * and after type are values and those are ony
    * what this enum can accept and use.
    *
    * Type of values in enum is int
    * name int constance so they can't be changed
    * and the values are 0,1,2,3 ... and they increment automatically
    */
    private enum Status { NOTSTARTEDYET, PROCEED, WON, LOST };

    /*
    * Private so visible only to this class
    * static will mean that we can ref to this variable
    * by ref to MainActivity class without creating any object
    * MainActivity.Status <- example
    */

    private static final int TIGER_CLAWS = 2;
    private static final int TREE = 3;
    private static final int CEVEN = 7;
    private static final int WE_LEVEN = 11;
    private static final int PANTHER = 12;


    /*
    *Just creating object without Instantiation
    * Setting firstTime to true
    * and setting texts to empty lines
    */
    TextView txtCalculations;
    ImageView imgDice;
    Button btnRestartGame;

    String oldCalculations = "";
    boolean firstTime = true;
    Status gameStatus = Status.NOTSTARTEDYET;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*Casting widgets*/

        txtCalculations = (TextView) findViewById(R.id.txtCalculations);
        imgDice = (ImageView) findViewById(R.id.imgDice);
        btnRestartGame = (Button) findViewById(R.id.btnRestartGame);
        final TextView txtGameStatus = (TextView) findViewById(R.id.txtGameStatus);

        makeImgDiceInvisible();

        txtGameStatus.setText("");
        txtCalculations.setText("");

        imgDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (gameStatus == Status.NOTSTARTEDYET){

                    int diceSum = letsRollTheDice();
                    oldCalculations = txtCalculations.getText().toString();
                    points = 0;

                    switch (diceSum){

                        case CEVEN:
                        case WE_LEVEN:
                            gameStatus = Status.WON;
                            txtGameStatus.setText("You win");
                            makeImgDiceInvisible();
                            makebtnRestartVisible();
                            break;

                        case TIGER_CLAWS:
                        case TREE:
                        case PANTHER:
                            gameStatus = Status.LOST;
                            txtGameStatus.setText("You Lost");
                            makeImgDiceInvisible();
                            makebtnRestartVisible();
                            break;

                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                            gameStatus = Status.PROCEED;
                            points = diceSum;
                            txtCalculations.setText(oldCalculations + "Your Points is: " +points + "/n");
                            txtGameStatus.setText();
                            oldCalculations = "Your Point is " + points + "/n";
                            break;


                    }

                    return;

                }

            }
        });

    }

    private void makeImgDiceInvisible(){

        imgDice.setVisibility(View.INVISIBLE);

    }

    private void makeBtnRestartInvisible(){

        btnRestartGame.setVisibility(View.INVISIBLE);

    }

    private void makeImgDiceVisible(){

        imgDice.setVisibility(View.VISIBLE);

    }

    private void makebtnRestartVisible(){

        btnRestartGame.setVisibility(View.VISIBLE);

    }

    private int letsRollTheDice(){

        int randDie1 = 1 + secRandNumb.nextInt(6);
        int randDie2 = 1 + secRandNumb.nextInt(6);
        int sum = randDie1 + randDie2;

        txtCalculations.setText(String.format(oldCalculations + "You Rolled %d + %d = %d%n",
                randDie1, randDie2, sum));

    }


}
