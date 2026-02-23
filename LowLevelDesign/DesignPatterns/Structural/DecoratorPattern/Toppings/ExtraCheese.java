package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Toppings;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.BasePizza;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 15;
    }
}
