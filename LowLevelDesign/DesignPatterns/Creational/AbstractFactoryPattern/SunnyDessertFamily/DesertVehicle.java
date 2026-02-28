package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Vehicle;

public class DesertVehicle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving on desert sand");
    }
}
