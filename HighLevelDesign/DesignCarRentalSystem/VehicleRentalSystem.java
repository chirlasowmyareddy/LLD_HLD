package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

public class VehicleRentalSystem {
    private Store store;

    public VehicleRentalSystem(Store store){
        this.store = store;
    }

    public Vehicle rentVehicle(User user){
        Vehicle vehicle     = store.getInventory().getAvailableVehicles().get(0);

        vehicle.setVehicleStatus(VehicleStatus.RENTED);

        System.out.println(user.getName()+ " rented vehicle "+ vehicle.getVehicleId());

        return vehicle;
    }
}