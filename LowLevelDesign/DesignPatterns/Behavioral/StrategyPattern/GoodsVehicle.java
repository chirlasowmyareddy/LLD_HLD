package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
