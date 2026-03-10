package LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy;

import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Vehicle;

public interface BillingStrategy {
    double calculateBill(Vehicle vehicle,int days);
}
