package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FacadeDesignPattern;

public class PaymentService {

    public boolean makePayment(String paymentMethod) {
        System.out.println("Processing payment using: " + paymentMethod);
        return true; // assume payment always succeeds

    }
    
}
