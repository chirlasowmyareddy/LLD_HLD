package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.Card;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.Enums.TransactionType;

public class SelectOperationState extends ATMState{

    public SelectOperationState(){
        showOperations();
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
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
    public void selectOperation(ATM atmObject,Card card,TransactionType txnType){
        switch(txnType) {
            case CASH_WITHDRAWAL:
                atmObject.setCurrentATMState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atmObject.setCurrentATMState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atmObject);
        }
    }
}
