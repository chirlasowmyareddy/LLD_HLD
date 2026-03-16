package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.Card;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.AmountWithdrawal.CashWithdrawProcessor;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.AmountWithdrawal.FiveHundredWithdrawProcessor;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.AmountWithdrawal.OneHundredWithdrawProcessor;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.AmountWithdrawal.TwoThousandWithdrawProcessor;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState(){

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

    public void cashWithdrawal(ATM atmObject ,Card card,int withdrawalAmountRequest){
        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
                    
            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }

    }
}
