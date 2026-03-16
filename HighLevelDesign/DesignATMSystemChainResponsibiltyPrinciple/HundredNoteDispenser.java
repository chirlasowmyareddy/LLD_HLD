package LLD_HLD.HighLevelDesign.DesignATMSystemChainResponsibiltyPrinciple;

public class HundredNoteDispenser extends ATMDispenser{

    @Override
    public void dispense(int amount) {
        
        if(amount>=100){
            int num  = amount/100;
            int rem = amount%100;


            System.out.println("Dispensing "+ num + "notes of 100");

            if(rem!=0 && nextDispenser!=null){
                nextDispenser.dispense(rem);
            }
        }
        else if(nextDispenser!=null){
            nextDispenser.dispense(amount);
        }

    }    
}
