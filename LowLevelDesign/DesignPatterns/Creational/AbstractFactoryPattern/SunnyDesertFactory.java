package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Weather;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily.DesertTerrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily.DesertVehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily.SunnyWeather;

public class SunnyDesertFactory implements GameFactory {
    @Override
    public Terrain createTerrain() {
        return new DesertTerrain();
    }

    @Override
    public Vehicle createVehicle() {
        return new DesertVehicle();
    }

    @Override
    public Weather createWeather() {
        return new SunnyWeather();
    }
}
