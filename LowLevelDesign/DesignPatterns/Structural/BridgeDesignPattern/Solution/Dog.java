package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class Dog extends LivingThings{

    public Dog(BreathingProcess breathingProcess) {
            super(breathingProcess);
    }
    
    @Override
    public void breathe() {
        System.out.println("Dog: ");
        breathingProcess.breathe();
    }
    
}
