package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Pizzas.FarmHouse;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Pizzas.VegDelight;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Toppings.ExtraCheese;
import LLD_HLD.LowLevelDesign.DesignPatterns.Structural.DecoratorPattern.Toppings.Mushroom;

public class StoreOrders {

    public static void main(String[] args){

        BasePizza Order1 = new FarmHouse();
        Order1  = new ExtraCheese(Order1);

        System.out.println(Order1.cost());

        BasePizza Order2 = new VegDelight();
        Order2 = new Mushroom(Order2);
        Order2 = new ExtraCheese(Order2);

        System.out.println(Order2.cost());


    }
}
