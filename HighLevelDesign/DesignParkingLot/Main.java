package LLD_HLD.HighLevelDesign.DesignParkingLot;

import LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage.ParkingFloor;
import LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage.ParkingLot;
import LLD_HLD.HighLevelDesign.DesignParkingLot.ParkingPackage.ParkingSpot;
import LLD_HLD.HighLevelDesign.DesignParkingLot.PricingPackage.HourlyPricingStrategy;
import LLD_HLD.HighLevelDesign.DesignParkingLot.PricingPackage.PricingStrategy;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.Vehicle;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleFactory;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // strategy
        PricingStrategy strategy = new HourlyPricingStrategy(20);

        //creating a parkingLot
        ParkingLot parkingLot = ParkingLot.getInstance(strategy);

        //create floors
        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot(1, VehicleType.Bike));
        floor1.addSpot(new ParkingSpot(2,VehicleType.Car));

        parkingLot.addFloor(floor1);

        //factory creating the vehicle and assigning the parking spot
        Vehicle car = VehicleFactory.createVehicle(VehicleType.Car,"KA01HYUW8G");

        //parking the vehicle
        Ticket ticket = parkingLot.parkVehicle(car);

        Thread.sleep(2000);

        double amount = parkingLot.unParkVehicle(ticket);

        System.out.println("Total amount should be paid by the vehicle : "+ amount);

    }
}
