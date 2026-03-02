package LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage;

import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber){
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot parkingSpot){
        spots.add(parkingSpot);
    }

    public ParkingSpot getAvailableSpot(VehicleType type){
        for(ParkingSpot spot : spots){
            if(!spot.isOccupied() && spot.getType()==type){
                return spot;
            }
        }
        return null;
    }
}

