package com.design.pattern.creationPattern.builderDesignPattern.model;

import com.design.pattern.creationPattern.builderDesignPattern.Car;
import lombok.Getter;
import lombok.Setter;

public class TripComputer {
    @Getter
    @Setter
    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel Level:"+ car.getFuel());
    }

    public void showStatus() {
        if(this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
