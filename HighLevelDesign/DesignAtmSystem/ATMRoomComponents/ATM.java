package LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMRoomComponents;

import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates.ATMState;
import LLD_HLD.HighLevelDesign.DesignAtmSystem.ATMStates.IdleState;

public class ATM {

    private static ATM atmObject = new ATM();//Singleton : eager initialization { need to understand this more}

    ATMState currentATMState;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private int atmBalance;

    private ATM(){

    }

    public static ATM getATMObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public int getNoOfTwoThousandNotes() {
        return this.noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return this.noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return this.noOfOneHundredNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }


    public void printCurrentATMStatus() {
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes =  noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes =  noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void deductATMBalance(int number) {
        atmBalance =  atmBalance - number;
        
    }
}
