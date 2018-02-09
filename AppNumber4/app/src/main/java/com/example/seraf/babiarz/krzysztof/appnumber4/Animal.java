package com.example.seraf.babiarz.krzysztof.appnumber4;

/**
 * Created by SeraF on 04/02/2018.
 */

public class Animal extends Object{

    private final String name;
    private final String color;
    private int amountOfSpeed;
    private int amountOfPower;

    public Animal(String name, String color, int amountOfSpeed, int amountOfPower){

        this.name = name;
        this.color = color;
        this.amountOfSpeed = amountOfSpeed;
        this.amountOfPower = amountOfPower;

    }


    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void setAmountOfSpeed(int amountOfSpeed){
        this.amountOfSpeed = amountOfSpeed;
    }

    public int getAmountOfSpeed(){
        return amountOfSpeed;
    }

    public void setAmountOfPower(int amountOfPower){
        this.amountOfPower = amountOfPower;
    }

    public int getAmountOfPower(){
        return amountOfPower;
    }

    public int evaluateAnimalValue(){

        int result = amountOfSpeed * amountOfPower;
        return result;

    }

    @Override
    public String toString() {
        return String.format("%s: %s%n %s: %s%n %s: %d%n %s %d%n", " Name ", name, " Color ", color, " Speed " , amountOfSpeed, " Power ", amountOfPower );
    }
}
