package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class GillBreathing implements BreathingProcess{

    @Override
    public void breathe() {
        System.out.println("Breathing through Gills");
    }
    
}
