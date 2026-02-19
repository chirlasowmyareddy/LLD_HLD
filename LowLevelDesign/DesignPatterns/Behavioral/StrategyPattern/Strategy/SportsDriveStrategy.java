package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
