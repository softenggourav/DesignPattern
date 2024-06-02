package com.design.pattern.creationPattern.factoryDesignPattern;

import java.util.Objects;

public class Factory {

    public static Vehicle getVehicle(String type, String name, int cap) {
        if (Objects.equals(type, "Bike")) {
            return new Bike(name, cap);
        } else if (Objects.equals(type, "Car")) {
            return new Car(name, cap);
        } else if (Objects.equals(type, "Bus")) {
            return new Bus(name, cap);
        }
        return new NullVehicle();
    }
}
