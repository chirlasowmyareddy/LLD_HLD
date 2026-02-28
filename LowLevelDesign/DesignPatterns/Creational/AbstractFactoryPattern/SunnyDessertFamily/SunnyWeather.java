package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Weather;

public class SunnyWeather implements Weather {
    @Override
    public void showWeather() {
        System.out.println("Showing sunny weather");
    }
}
