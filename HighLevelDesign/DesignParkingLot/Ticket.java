package LLD_HLD.HighLevelDesign.DesignParkingLot;

import LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage.ParkingSpot;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    private  static int counter = 0;

    private int ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;

    public Ticket(Vehicle vehicle,ParkingSpot parkingSpot){
        this.entryTime = LocalDateTime.now();
        this.spot = parkingSpot;
        this.ticketId=++counter;
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpot(){
        return spot;
    }

    public LocalDateTime getEntryTime(){
        return entryTime;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }


}