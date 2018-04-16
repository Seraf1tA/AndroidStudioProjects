package com.example.seraf.babiarz.krzysztof.app23;

public class Game {

    private String gameName;
    private int[][] scores;

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

    public int getMinimumScore(){

        /*creating variable of type int name it lowestScore go in to index 0 and sub 0*/
        int lowestScore = scores[0][0]; // assume this value is the smallest score value

        /* enchanced for loop with array of type int named gameScores and it will go trough scores array*/
        for (int[] gameScores : scores){

            /* and another for loop */
            for (int score : gameScores){
                if (score < lowestScore){
                    lowestScore = score;
                }
            }
        }
        return lowestScore;
    }
}
