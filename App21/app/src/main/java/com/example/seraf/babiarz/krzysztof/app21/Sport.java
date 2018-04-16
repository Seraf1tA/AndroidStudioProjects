package com.example.seraf.babiarz.krzysztof.app21;

import android.widget.TextView;

public class Sport {

    private String sportName;
    private int[] scores;

    public Sport(String sportName, int[] scores) {

        this.sportName =sportName;
        this.scores =scores;

    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getMinimumValue(){

        int lowestScore = scores[0]; // now we assumind that scores[index] is the lowest score
        for (int score : scores){
            if (score < lowestScore){
                lowestScore = score;
            }
        }
        return lowestScore;
    }

    public int getTheMaximumValue(){

        int highestScore = scores[0]; // now we are assuming that scores[index] is the highest score
        for (int score : scores){
            if (score > highestScore){
                highestScore = score;
            }
        }
        return highestScore;
    }

    public double getTheAverageValue(){

        int total = 0;

        for (int score : scores){
            total += score;
        }
        return (double) total / scores.length;
    }

    public void  letsOutPutTheScores(TextView textView){

        String oldTextViewValue;

        // i = index

        for (int i = 0; i < scores.length; i++){

            oldTextViewValue= textView.getText().toString();

            textView.setText((String.format(oldTextViewValue + "Athlete Number: %2d: %3d\n", i, scores[i])));

        }

    }

}
