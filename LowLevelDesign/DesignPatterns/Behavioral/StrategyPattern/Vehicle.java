package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObj;

    public Vehicle(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive()
    {
        driveObj.drive();
    }
}
