package com.design.pattern.creationPattern.builderDesignPattern;

import com.design.pattern.creationPattern.builderDesignPattern.model.Engine;
import com.design.pattern.creationPattern.builderDesignPattern.model.GPSNavigator;
import com.design.pattern.creationPattern.builderDesignPattern.model.Transmission;
import com.design.pattern.creationPattern.builderDesignPattern.model.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(Builder.CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(Builder.CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(Builder.CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
