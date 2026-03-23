package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.BridgeDesignPattern.Solution;

public class Client {

    public static void main(String[] args){
        System.out.println("=============Bridge Design Pattern=============");

        LivingThings dog = new Dog(new LungBreathing());
        LivingThings fish = new Fish(new GillBreathing());
        LivingThings tree = new Tree(new Photosynthesis());

        dog.breathe();
        fish.breathe();
        tree.breathe();
    }
}
