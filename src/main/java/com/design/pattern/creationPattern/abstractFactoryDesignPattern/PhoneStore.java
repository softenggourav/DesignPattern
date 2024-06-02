package com.design.pattern.creationPattern.abstractFactoryDesignPattern;

import java.util.Objects;

public class PhoneStore {

    public static Phone getPhone(String brand, String model) {
        PhoneFactory factory;
        if (Objects.equals(brand, "Apple")) {
            factory = new AppleFactory();
        } else if (Objects.equals(brand, "OnePlus")) {
            factory = new OnePlusFactory();
        } else if (Objects.equals(brand, "Samsung")) {
            factory = new SamsungFactory();
        } else {
            factory = null;
        }

        if (factory != null) {
            return factory.getPhone(model);
        } else {
            return new NullPhone();
        }
    }
}
