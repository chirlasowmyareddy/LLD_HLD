package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

public class Vehicle {
    private int vehicleId;
    private VehicleType vehicleType;
    private VehicleStatus vehicleStatus;
    private double pricePerDay;

    public Vehicle(int vehicleId, VehicleType vehicleType, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }

    public int getVehicleId() {
        return this.vehicleId;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public VehicleStatus getVehicleStatus() {
        return this.vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }
}
