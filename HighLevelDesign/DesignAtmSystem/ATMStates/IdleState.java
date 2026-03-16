package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.Card;

public class IdleState extends ATMState{

    @Override
    public void insertCard(ATM atm,Card card){
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
    
}
