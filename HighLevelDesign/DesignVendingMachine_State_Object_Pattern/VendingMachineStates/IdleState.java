package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.VendingMachineStates;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.State;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public class IdleState extends State{
    
    public IdleState(){
        System.out.println("Currently Vending Machine is in Idle State");
    
    }

    // public IdleState(VendingMachine machine){
    //     System.out.println("Currenlty Vending Machine is in Idle State");
    // }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine){
        machine.setVendingMachinState(new HasMoneyState());
    }
    
}
