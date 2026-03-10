package LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy;

import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Vehicle;

public class DailyBillingStrategy implements BillingStrategy{

    @Override
    public double calculateBill(Vehicle vehicle, int days) {
        return vehicle.getPricePerDay() * days;
    }

    
    

    
}
