package com.example.seraf.babiarz.krzysztof.app23;

import android.widget.TextView;

public class Game {

    /* Declaration without instantiation */
    private String gameName;
    private int[][] scores;

    /*Creating constractor and instantiating, name of constructor must be the same as class name */
    public Game(String gameName, int[][] scores){

        this.gameName = gameName;
        this.scores = scores;

    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /*

    * Method with access modifier public
    * return type int beacuse it need to return int
    * getMinimumScore name
    * and this method dont accept any argument( empty brackets )

    */
    public int getMinimumScore(){

        /*
        * creating variable of type int name it lowestScore go in to index 0 and sub 0
        * and lowestScore is refering to instance variable scores
        */
        int lowestScore = scores[0][0]; // assume this value is the smallest score value

        /* enhanced for loop with array of type int named gameScores and it will go trough scores array*/
        for (int[] gameScores : scores){

            /*
            * and another enhanced for loop inside first for loop
            * int variable, name score and it will iterate(go/repeat) through array gameScores
            *
            */
            for (int score : gameScores){
                if (score < lowestScore){
                    lowestScore = score;
                }
            }
        }
        return lowestScore;
    }

    public int getMaximumScore(){

        int highestScore = scores[0][0]; // Assume this is the Highest Score Value

        for (int[] gameScores : scores){
            for (int score : gameScores){
                if (score > highestScore){
                    highestScore = score;
                }
            }
        }
        return highestScore;
    }

    public double getTheAverageScores(int[] scores){

        int total = 0;

        // Sum scores for each game
        for (int score : scores){
            total+= score;
        }

        // casting int total to double
        return (double) total / scores.length;
    }

    public void letsOutPutToScreen(TextView textView){

        String oldTextViewValue;

        for (int gameIndex = 0; gameIndex < scores.length; gameIndex++){

            for (int gameScore : scores[gameIndex]){

                oldTextViewValue = textView.getText().toString();

                textView.setText(String.format(oldTextViewValue + " Game Number %2d: %3d\n\n\n",
                        (gameIndex + 1), gameScore));
            }

        }
    }
}
