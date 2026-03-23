package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class Fish extends LivingThings{

    public Fish(BreathingProcess breathingProcess) {
            super(breathingProcess);
    }

    @Override
    public void breathe() {
        System.out.println("Fish: ");
        breathingProcess.breathe();
    }
    
}
