package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Weather;

public class RainyWeather implements Weather {
    @Override
    public void showWeather() {
        System.out.println("Showing Rainy Weather");
    }
}
