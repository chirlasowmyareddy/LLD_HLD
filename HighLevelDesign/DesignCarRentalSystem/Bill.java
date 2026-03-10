package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

public class Bill {

    private Vehicle vehicle;
    private int days;
    private double amount;



    public Bill(Vehicle vehicle, int days, double amount) {
        this.vehicle = vehicle;
        this.days = days;
        this.amount = amount;
    }
    
    public double getAmount(){
        return amount;
    }
}
