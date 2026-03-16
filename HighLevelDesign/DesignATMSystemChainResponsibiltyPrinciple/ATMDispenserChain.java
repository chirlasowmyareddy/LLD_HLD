package LLD_HLD.HighLevelDesign.DesignATMSystemChainResponsibiltyPrinciple;

public class ATMDispenserChain {

    private ATMDispenser chain;
    
    public ATMDispenserChain(){
        ATMDispenser d2000 = new TwoThousandDispenser();
        ATMDispenser d500 = new FiveHundredDispenser();
        ATMDispenser d100 = new HundredNoteDispenser();

        d2000.setNextDispenser(d500);
        d500.setNextDispenser(d100);

        chain = d2000;
    }

    public void dispenseCash(int amount){
        chain.dispense(amount);
    }
    
}
