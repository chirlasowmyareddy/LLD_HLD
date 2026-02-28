package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces;

//This factory ensures all products belong to the same family.
public interface GameFactory {
    Terrain createTerrain();
    Vehicle createVehicle();
    Weather createWeather();
}
