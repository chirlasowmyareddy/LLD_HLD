package LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage;

import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.Vehicle;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

public class ParkingSpot {
    private int spotId;
    private VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int spotId,VehicleType type){
        this.spotId = spotId;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean assignVehicle(Vehicle vehicle){
        if(!isOccupied() && vehicle.getType()==this.type){
            this.isOccupied=true;
            this.vehicle = vehicle;
            return true;
        }
        else{
            return false;
        }
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied(){
        return isOccupied;
    }

    public VehicleType getType(){
        return type;
    }

}