package LLD_HLD.HighLevelDesign.DesignATMSystemChainResponsibiltyPrinciple;

public class ATM {

    public static void main(String[] args){
    
        ATMDispenserChain atm  = new ATMDispenserChain();

        atm.dispenseCash(800);


    }
    
}
