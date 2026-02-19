package LLD_HLD.LowLevelDesign.WithoutDesignPatterns.Behavioral.StrategyPattern;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new MotorVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new OffRoadVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new SportsVehicle();
        vehicle3.drive();
    }
}
