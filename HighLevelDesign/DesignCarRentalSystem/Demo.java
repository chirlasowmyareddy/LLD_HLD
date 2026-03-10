package LLD_HLD.HighLevelDesign.DesignCarRentalSystem;

import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.BillingStrategy;
import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.DailyBillingStrategy;
import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.PaymentStrategy;
import LLD_HLD.HighLevelDesign.DesignCarRentalSystem.Strategy.UPIPaymentStrategy;
import LLD_HLD.HighLevelDesign.DesignParkingLot.VehiclePackage.VehicleType;

public class Demo {
    public static void main(String[] args){
        Location location = new Location("Delhi","Cannaught Place");

        Store store = new Store(1,location);

        //
        store.getInventory().addVehicle(new Vehicle(1, VehicleType.Car, 2000));
        store.getInventory().addVehicle(new Vehicle(2, VehicleType.Car, 3000));

        User user = new User(101, "Rahul");
        User user2 = new User(102, "Ram");

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(store);

        Vehicle rentedVehicle = rentalSystem.rentVehicle(user);
        Vehicle rentedVehicle1 = rentalSystem.rentVehicle(user2);


        // billing
        BillingStrategy billingStrategy = new DailyBillingStrategy();
        BillingManager billManager = new BillingManager(billingStrategy);
        

        Bill bill = billManager.generateBill(rentedVehicle, 3);

        Bill bill2 = billManager.generateBill(rentedVehicle1, 1);

        // payment
        PaymentStrategy paymentStrategy = new UPIPaymentStrategy();
        PaymentManager paymentManager = new PaymentManager(paymentStrategy);

        paymentManager.processPayment(bill.getAmount());
        paymentManager.processPayment(bill2.getAmount());
    }
    
}
