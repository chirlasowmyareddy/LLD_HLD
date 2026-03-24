package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FacadeDesignPattern;

public class NotificationService {

    public void sendConfirmation(String productId) {
        System.out.println("Sending order confirmation for product: " + productId);
    }
    
}
