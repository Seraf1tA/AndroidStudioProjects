package com.example.seraf.babiarz.krzysztof.appnumber4;

/**
 * Created by SeraF on 06/02/2018.
 */

public class Cat extends Animal{


    private final int numberOfLegs;
    private boolean canHuntOtherAnimals;

    public Cat(String name, String color, int amoutnOfSpeed, int amountOfPower, int numberOfLegs, boolean canHuntOtherAnimals){

        super(name, color, amoutnOfSpeed, amountOfPower);

        this.numberOfLegs = numberOfLegs;
        this.canHuntOtherAnimals = canHuntOtherAnimals;

    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean CanHuntOtherAnimals() {
        return canHuntOtherAnimals;
    }

    public void setCanHuntOtherAnimals(boolean canHuntOtherAnimals) {
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }

    /*

    can be use only if used protected not private variable


    public String outputSomeValuesToTheScreen(){

        return "Name: " + name + " Color " + color + " Speed " + amountOfSpeed + " Power " + amountOfPower;
    }

   */

    @Override
    public String toString() {

        return super.toString() + String.format("%s: %d%n %s: %b%n", " Number of legs ", numberOfLegs, " Can hunt? ", canHuntOtherAnimals )
                + "Animal Value " + evaluateAnimalValue() + " ";
    }
}
