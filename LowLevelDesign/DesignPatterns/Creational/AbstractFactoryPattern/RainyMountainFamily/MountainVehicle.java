package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Vehicle;

public class MountainVehicle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving on Mountain Roads");
    }
}
