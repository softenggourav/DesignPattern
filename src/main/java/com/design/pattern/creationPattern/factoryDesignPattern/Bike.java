package com.design.pattern.creationPattern.factoryDesignPattern;

public class Bike extends Vehicle {
    private Bike() {
    }

    public Bike(String name, int cap) {
        this.cap = cap;
        this.name = name;
    }

    @Override
    public int getCapacity() {
        return this.cap;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return "This is a Bike";
    }
}
