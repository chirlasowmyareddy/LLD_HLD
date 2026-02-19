package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive compatibilty");
    }
}
