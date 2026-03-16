package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.Card;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.Enums.TransactionType;

public class HasCardState extends ATMState{

    public HasCardState(){
        System.out.println("enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm,Card card,int pin){
        boolean isCorrectPINEntered  = card.isCorrectPINEntered(pin);

        if(isCorrectPINEntered){
            atm.setCurrentATMState(new SelectOperationState());

        }else{
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
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
    
}
