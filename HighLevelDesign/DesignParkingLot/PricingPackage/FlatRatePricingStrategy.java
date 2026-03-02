package LLD_HLD.HighLevelDesign.DesignParkingLot.PricingPackage;

public class FlatRatePricingStrategy implements PricingStrategy {

    private double flatRate;

    public FlatRatePricingStrategy(double flatRate){
        this.flatRate = flatRate;
    }

    @Override
    public double calculatePrice(long hours) {
        return flatRate;
    }

}
