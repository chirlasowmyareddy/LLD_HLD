package LLD_HLD.HighLevelDesign.DesignParkingLot.PricingPackage;

public class HourlyPricingStrategy implements PricingStrategy {

    private double ratePerHour;
    public HourlyPricingStrategy(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculatePrice(long hours) {
        return hours * ratePerHour;
    }
}