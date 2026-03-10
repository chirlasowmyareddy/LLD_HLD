package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    private List<Vehicle> vehicles;

    public VehicleInventoryManagement() {
        vehicles  = new ArrayList<>();
    }

    //add vehicles
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    //get available vehicles
    public List<Vehicle> getAvailableVehicles(){
        List<Vehicle> availableVehicles = new ArrayList<>();

        for(Vehicle v: vehicles){
            if(v.getVehicleStatus()== VehicleStatus.AVAILABLE){
                availableVehicles.add(v);
            }
        }
        return availableVehicles;
    }

}
