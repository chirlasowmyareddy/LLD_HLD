package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle()
    {
        super(new NormalDriveStrategy());
    }
}
