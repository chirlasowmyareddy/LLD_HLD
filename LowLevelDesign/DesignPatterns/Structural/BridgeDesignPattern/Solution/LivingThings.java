package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public abstract class LivingThings {

    protected BreathingProcess breathingProcess;

    public LivingThings(BreathingProcess breathingProcess){
        this.breathingProcess = breathingProcess;
    }
    abstract public void breathe();
}
