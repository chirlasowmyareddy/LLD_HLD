package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Problem;

public class Demo {

    public static void main(String[] args){
        System.out.println("==============Bridge Design Pattern============");

        LivingBeing dog = new Dog();
        dog.breathe();

        LivingBeing whale = new Whale();
        whale.breathe();

        LivingBeing tree = new Tree();
        tree.breathe();

        LivingBeing fish = new Fish();
        fish.breathe();

    }
    
}
