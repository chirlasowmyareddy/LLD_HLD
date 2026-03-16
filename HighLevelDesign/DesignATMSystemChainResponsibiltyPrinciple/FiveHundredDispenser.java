package LLD_HLD.HighLevelDesign.DesignATMSystemChainResponsibiltyPrinciple;

public class FiveHundredDispenser extends ATMDispenser{

    @Override
    public void dispense(int amount) {
        
        if(amount>=500){
            int num  = amount/500;
            int rem = amount%500;


            System.out.println("Dispensing "+ num + "notes of 500");

            if(rem!=0 && nextDispenser!=null){
                nextDispenser.dispense(rem);
            }
        }
        else if(nextDispenser!=null){
            nextDispenser.dispense(amount);
        }

    }
    
}
