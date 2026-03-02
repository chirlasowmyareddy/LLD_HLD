package LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage;

import LLD_HLD.HighLevelDesign.DesignParkingLot.PricingPackage.PricingStrategy;
import LLD_HLD.HighLevelDesign.DesignParkingLot.Ticket;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.Vehicle;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// uses singleton pattern
public class ParkingLot {
    private List<ParkingFloor> floors;
    private static ParkingLot instance;

    private PricingStrategy pricingStrategy;

    private ParkingLot(PricingStrategy strategy){
        this.floors = new ArrayList<>();
        this.pricingStrategy = strategy;
    }

    public static ParkingLot getInstance(PricingStrategy strategy) {
        if(instance == null){
            return new ParkingLot(strategy);
        }
        return instance;
    }

    //add floor
    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    //park vehicle
    public Ticket parkVehicle(Vehicle vehicle) {

        for(ParkingFloor floor:floors){
            ParkingSpot spot = floor.getAvailableSpot(vehicle.getType());
            if(spot!=null){
                spot.assignVehicle(vehicle);
                return new Ticket(vehicle,spot);
            }
        }
        System.out.println("No Spot Available");
        return null;
    }

    //unpark vehicle
    public double unParkVehicle(Ticket ticket) {
        LocalDateTime exitTime = LocalDateTime.now();
        long hours = Duration.between(ticket.getEntryTime(),exitTime).toHours();
        if(hours==0) hours = 1;

        ticket.getSpot().removeVehicle();
        return pricingStrategy.calculatePrice(hours);
    }

}
