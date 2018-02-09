package com.example.seraf.babiarz.krzysztof.appnumber4;

/**
 * Created by SeraF on 06/02/2018.
 */

public class Leopard extends Cat{

    private String claws;

    public Leopard(String name, String color, int amoutnOfSpeed, int amountOfPower, int numberOfLegs, boolean canHuntOtherAnimals, String claws){

        super(name, color, amoutnOfSpeed, amountOfPower, numberOfLegs, canHuntOtherAnimals);

        this.claws = claws;

    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s: %s","Claws", claws);
    }
}
