package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Pizzas;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
