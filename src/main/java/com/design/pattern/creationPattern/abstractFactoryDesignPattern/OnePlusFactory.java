package com.design.pattern.creationPattern.abstractFactoryDesignPattern;

import java.util.Objects;

public class OnePlusFactory implements PhoneFactory {
    public Phone getPhone(String model) {
        if (Objects.equals(model, "onePlus7"))
            return new Phone(model);
        else if (Objects.equals(model, "onePlus8"))
            return new Phone(model);

        return new NullPhone();
    }
}
