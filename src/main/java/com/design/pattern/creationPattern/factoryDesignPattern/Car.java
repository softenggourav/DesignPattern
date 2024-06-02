package com.design.pattern.creationPattern.factoryDesignPattern;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String name, int cap) {
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
        return "This is a Car";
    }
}
