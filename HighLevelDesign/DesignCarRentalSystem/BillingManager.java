package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.BillingStrategy;

public class BillingManager {

    private BillingStrategy billingStrategy;

    public BillingManager(BillingStrategy billingStrategy){
        this.billingStrategy = billingStrategy;
    }

    public Bill generateBill(Vehicle vehicle, int days){
        double amount = billingStrategy.calculateBill(vehicle, days);

        return new Bill(vehicle,days,amount);
    }
    
}
