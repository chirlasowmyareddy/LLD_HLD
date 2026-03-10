package LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
       System.out.println("Payment of "+amount+ "done using UPI ");
    }

}
