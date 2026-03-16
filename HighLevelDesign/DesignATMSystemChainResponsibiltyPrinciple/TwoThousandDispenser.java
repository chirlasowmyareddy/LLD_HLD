package LLD_HLD.HighLevelDesign.DesignATMSystemChainResponsibiltyPrinciple;

public class TwoThousandDispenser extends ATMDispenser{

    @Override
    public void dispense(int amount) {
        
        if(amount>=2000){
            int num  = amount/2000;
            int rem = amount%2000;


            System.out.println("Dispensing "+ num + "notes of 2000");

            if(rem!=0 && nextDispenser!=null){
                nextDispenser.dispense(rem);
            }
        }
        else if(nextDispenser!=null){
            nextDispenser.dispense(amount);
        }

    }
    
}
