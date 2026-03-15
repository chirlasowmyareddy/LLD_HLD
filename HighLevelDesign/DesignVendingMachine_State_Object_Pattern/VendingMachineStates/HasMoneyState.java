package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.VendingMachineStates;

import java.util.List;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Coin;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.State;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.Item;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public class HasMoneyState extends State{

    public HasMoneyState(){
        System.out.println("Current Vending Machine is in HasMoneyState");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine){
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachinState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin){
       System.out.println("Accepted the coin");
       vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine){
        // by default nothing happens
        machine.setVendingMachinState(new SelectionState());
    }

    
}
