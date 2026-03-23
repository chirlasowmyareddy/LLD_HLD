package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Problem;

public class Fish extends LivingBeing{

    @Override
    public void breathe() {
        System.out.println("Fish: Breathes through gills; Lives in water; Respiratory system: 2 gills");
        System.out.println("Breathing Process: Absorbs Oxygen from the water and releases Carbon Dioxide.");

    }
}
