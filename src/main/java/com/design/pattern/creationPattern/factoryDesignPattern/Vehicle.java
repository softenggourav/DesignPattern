package com.design.pattern.creationPattern.factoryDesignPattern;

public abstract class Vehicle {
    int cap;
    String name;

    public abstract int getCapacity();

    public abstract String getName();

    public abstract String getDescription();
}
