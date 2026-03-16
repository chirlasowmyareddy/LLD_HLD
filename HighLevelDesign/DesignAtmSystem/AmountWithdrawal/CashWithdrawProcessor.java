package LLD_HLD.HighLevelDesign.DesignAtmSystem.AmountWithdrawal;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawalProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawalProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm,int remainingAmount){
        if(nextCashWithdrawalProcessor != null){
            nextCashWithdrawalProcessor.withdraw(atm, remainingAmount);
        }
    }

    
}
