package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.PaymentStrategy;

public class PaymentManager {

    private PaymentStrategy paymentStrategy;

    public PaymentManager(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {

        paymentStrategy.pay(amount);
    }
}
