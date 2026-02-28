package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.GameFactory;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Terrain;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Vehicle;
import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Weather;

public class Game {

    private Terrain terrain;
    private Vehicle vehicle;
    private Weather weather;

    public Game(GameFactory factory){
        this.terrain = factory.createTerrain();
        this.vehicle = factory.createVehicle();
        this.weather = factory.createWeather();
    }

    public void startGame(){
        terrain.render();
        vehicle.drive();
        weather.showWeather();
    }
}
