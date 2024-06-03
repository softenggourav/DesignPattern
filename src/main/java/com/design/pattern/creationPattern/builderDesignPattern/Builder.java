package com.design.pattern.creationPattern.builderDesignPattern;

import com.design.pattern.creationPattern.builderDesignPattern.model.Engine;
import com.design.pattern.creationPattern.builderDesignPattern.model.GPSNavigator;
import com.design.pattern.creationPattern.builderDesignPattern.model.Transmission;
import com.design.pattern.creationPattern.builderDesignPattern.model.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

    enum CarType {
        CITY_CAR,
        SPORTS_CAR,
        SUV
    }
}
