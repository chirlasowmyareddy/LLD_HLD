package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.VendingMachineStates;



import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.State;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.Item;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public class DispenseState extends State{

    public DispenseState(VendingMachine vendingMachine,int codeNumber) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(vendingMachine, codeNumber);

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception{
        System.out.println("Product has been dispensed");
        Item item =  vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachinState(new IdleState(vendingMachine));
        return item;
    }
    
}
