package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.GameFactory;

public class Main {
    public static void main(String[] args){
        GameFactory factory = new RainyMountainFactory();

        Game game = new Game(factory);

        game.startGame();
    }
}
