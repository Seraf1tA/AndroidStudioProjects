package com.example.seraf.babiarz.krzysztof.appnumber4;

/**
 * Created by SeraF on 06/02/2018.
 */

public class Bird extends Animal{

    private final boolean canFly;
    private int numberOfWings;
    private int numberOfLegs;

    public Bird(String name, String color, int amountOfSpeed, int amountOfPower, boolean canFly, int numberOfWings, int numberOfLegs){

        super(name, color, amountOfSpeed, amountOfPower);

        this.canFly = canFly;
        this.numberOfWings = numberOfWings;
        this.numberOfLegs = numberOfLegs;

    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s: %b%n %s: %d%n %s: %d", " Can fly ", isCanFly() ,
        " Number of Wings ", numberOfWings , " Number of legs ", numberOfLegs );
    }
}
