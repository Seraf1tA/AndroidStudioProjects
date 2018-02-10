package com.example.seraf.babiarz.krzysztof.appnumber5;

import android.graphics.Color;

/**
 * Created by SeraF on 10/02/2018.
 */

public class Car extends Vehicle{

    public Car(int speed, boolean hasBreakingSystem, int numberOfWheels){

        super(speed, hasBreakingSystem, numberOfWheels);
    }

    @Override
    public String toString() {

        // return super toString means it will go to vehicle class and execute to string method
        return super.toString();
    }
}
