package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        Vehicle vehicle1 =  new OffRoadVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();
    }
}
