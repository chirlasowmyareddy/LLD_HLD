package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Problem;

public class Whale extends LivingBeing{

    @Override
    public void breathe() {
        System.out.println("Whale: Breathes through lungs; Lives in water; Respiratory system: 2 lungs");
        System.out.println("Breathing Process: Inhales Oxygen from the water and Exhales Carbon Dioxide");
    }
}
