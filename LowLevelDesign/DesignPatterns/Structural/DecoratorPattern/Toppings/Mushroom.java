package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Toppings;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.BasePizza;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.ToppingsDecorator;

public class Mushroom extends ToppingsDecorator {

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
