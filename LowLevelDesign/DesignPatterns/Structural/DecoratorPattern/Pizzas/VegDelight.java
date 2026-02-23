package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Pizzas;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
