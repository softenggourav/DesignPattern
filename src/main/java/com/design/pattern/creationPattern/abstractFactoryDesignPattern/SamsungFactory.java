package com.design.pattern.creationPattern.abstractFactoryDesignPattern;

import java.util.Objects;

public class SamsungFactory implements PhoneFactory {
    public Phone getPhone(String model) {
        if (Objects.equals(model, "s23"))
            return new Phone(model);
        else if (Objects.equals(model, "s23 ultra"))
            return new Phone(model);

        return new NullPhone();
    }
}
