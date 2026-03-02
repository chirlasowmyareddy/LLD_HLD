package LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type, String licenseNumber){
        switch(type){
            case Car:
                return new Car(licenseNumber,type);
            case Bike:
                return new Bike(licenseNumber, type);

            default:
                throw new IllegalArgumentException("Invalid Vehicle Type");
        }
    }
}
/*
Open For Extension
Centralized Creation Logic
 */
