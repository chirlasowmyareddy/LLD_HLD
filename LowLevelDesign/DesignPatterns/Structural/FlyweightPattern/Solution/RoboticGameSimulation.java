package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FlyweightPattern.Solution;

// Client – supplies extrinsic state when using flyweights
public class RoboticGameSimulation {

    public static void main(String[] args){
        System.out.println("============Flyweight Design Pattern============");
        // Factory pattern is used to create objects
        // Flyweight pattern is used to reuse objects

        // Create 2 Humanoid robots and provide display coordinates(extrinsic state) at runtime

        IRobot humaniodRobot1  = RoboticFactory.createRobot("HUMANOID");
        humaniodRobot1.display(1, 2);

        IRobot humaniodRobot2  = RoboticFactory.createRobot("HUMANOID");
        humaniodRobot2.display(1, 2);

        // Create 2 Robotic Dog robots and provide display coordinates(extrinsic state) at runtime
        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboDog1.display(2, 9);
        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboDog2.display(11, 19);


        // Total robots created: 2 - because we are reusing the same object
        System.out.println("Total robots created: " + RoboticFactory.getTotalRobots());


    }
    
}
