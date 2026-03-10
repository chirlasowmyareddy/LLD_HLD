package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

public class Store {

    private int storeId;
    private Location location;
    private VehicleInventoryManagement inventory;

    public Store(int storeId, Location location) {
        this.storeId = storeId;
        this.location = location;
        this.inventory = new VehicleInventoryManagement();
    }

    public VehicleInventoryManagement getInventory() {
        return inventory;
    }

    public Location getLocation() {
        return location;
    }
}
