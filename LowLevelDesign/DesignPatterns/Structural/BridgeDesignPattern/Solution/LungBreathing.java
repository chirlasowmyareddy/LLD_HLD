package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class LungBreathing implements BreathingProcess{

    @Override
    public void breathe() {
       System.out.println("Breathing through lungs ");
    }
    
}
