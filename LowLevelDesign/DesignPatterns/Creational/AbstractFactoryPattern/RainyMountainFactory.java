package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Weather;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily.MountainTerrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily.MountainVehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily.RainyWeather;

public class RainyMountainFactory implements GameFactory {
    @Override
    public Terrain createTerrain() {
        return new MountainTerrain();
    }

    @Override
    public Vehicle createVehicle() {
        return new MountainVehicle();
    }

    @Override
    public Weather createWeather() {
        return new RainyWeather();
    }
}
