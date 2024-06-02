package com.design.pattern.creationPattern.factoryDesignPattern;

public class NullVehicle extends Vehicle {

    public NullVehicle() {
        this.name = "Invalid Type";
        this.cap = 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String getName() {
        return "Invalid Type";
    }

    @Override
    public String getDescription() {
        return "Vehicle is not present";
    }
}
