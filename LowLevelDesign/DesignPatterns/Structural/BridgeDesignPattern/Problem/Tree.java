package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Problem;

public class Tree extends LivingBeing{

    @Override
    public void breathe() {
        System.out.println("Tree: Breathes through leaves; Lives on land; Respiratory system: Leaves");
        System.out.println("Breathing Process: Inhales Carbon Dioxide and Exhales Oxygen as a result of photosynthesis.");
    }
}