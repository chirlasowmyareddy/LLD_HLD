package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FacadeDesignPattern;

public class ECommerceApp {

    public static void main(String[] args){
        System.out.println("===================Facade Design Pattern================");

        OrderFacade orderFacade = new OrderFacade();

        //Place Order with one call to Facade
        orderFacade.placeOrder("MacBook Pro","Credit Card");

        //Place another order with one call to Facade
        orderFacade.placeOrder("Cricket Bat","UPI");
    }
    
}
