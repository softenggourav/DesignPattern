package com.design.pattern.creationPattern.builderDesignPattern;

import lombok.Getter;

public class GPSNavigator {
    @Getter
    private String route;

    public GPSNavigator(){
        this.route="Surat, Gujarat";
    }

    public GPSNavigator(String manualRoute){
        this.route=manualRoute;
    }
}
