package com.example.seraf.babiarz.krzysztof.appnumber4;

/**
 * Created by SeraF on 06/02/2018.
 */

public class Lion extends Cat{

    private boolean isBrave;

    public Lion(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs, boolean canHuntOtherAnimals, boolean isBrave){

        super(name, color,amountOfSpeed, amountOfPower, numberOfLegs, canHuntOtherAnimals);

        this.isBrave = isBrave;

    }

    public boolean getIsBrave() {
        return isBrave;
    }

    public void setIsBrave(boolean brave) {
        isBrave = brave;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s: %b", " Is he brave? ", isBrave );
    }
}
