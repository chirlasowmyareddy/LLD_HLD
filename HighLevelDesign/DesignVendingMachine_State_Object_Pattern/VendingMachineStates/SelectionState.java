package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.VendingMachineStates;

import java.util.List;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Coin;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.State;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.Item;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public class SelectionState extends State{
    
    public SelectionState() {
        System.out.println("Currenlty Vending Machine is in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{

        //1. get item of this codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by User
        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachinState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachinState(new IdleState(machine));
        return machine.getCoinList();
    }

}
