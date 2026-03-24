package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.FacadeDesignPattern;

// Facade hides complexity and provides a simple unified interface
public class OrderFacade {

    private final InventoryService inventory ;
    private final PaymentService payment;
    private final NotificationService notification;
    private final ShippingService shipping;

    public OrderFacade(){
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.notification =  new NotificationService();
        this.shipping = new ShippingService();
    }
    
    // Simplified method for clients
    public void placeOrder(String productId, String paymentMethod) {
        
        // The following steps are hidden from the client and need to be executed in a specific order
        System.out.println("Placing Order For Product: "+productId);

        //Step 1: Check Stock
        if(!inventory.checkStock(productId)){
            System.out.println("Product out of stock!");
            return ;
        }

        //Step2: Make Payment
        if(!payment.makePayment(paymentMethod)){
            System.out.println("Payment Failed");
            return ;
        }

        // Step 3: Ship product
        shipping.shipProduct(productId);

        // Step 4: Send confirmation
        notification.sendConfirmation(productId);

        System.out.println("Order placed successfully!");


    }
    
}
