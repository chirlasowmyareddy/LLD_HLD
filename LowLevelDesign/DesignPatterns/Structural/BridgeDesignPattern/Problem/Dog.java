package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Problem;

public class Dog extends LivingBeing{

    // Breathing Process is tightly coupled to the LivingThings(abstraction)
    @Override
    public void breathe() {
        System.out.println("Dog: Breathes through its nose; Lives on land; Respiratory system: 2 lungs");
        System.out.println("Breathing Process: Inhales Oxygen from the air and Exhales Carbon Dioxide.");

    }   
}
