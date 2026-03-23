package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class Photosynthesis implements BreathingProcess{

    @Override
    public void breathe() {
        System.out.println("Breathing through process of photosynthesis. Releases Oxygen through leaves.");
    }
    
}
