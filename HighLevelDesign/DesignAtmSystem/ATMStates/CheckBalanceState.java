package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.Card;

public class CheckBalanceState extends ATMState{
    
    public CheckBalanceState(){

    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void displayBalance(ATM atm,Card card){
        System.out.println("Your balance is "+card.getBankBalance());
    }
}
