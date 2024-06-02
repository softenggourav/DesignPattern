package com.design.pattern.creationPattern.factoryDesignPattern;

public class Bus extends Vehicle {

    public Bus() {
    }

    public Bus(String name, int cap) {
        this.name = name;
        this.cap = cap;
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
        return "This is a Bus";
    }
}
