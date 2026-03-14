package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context;

import java.util.ArrayList;
import java.util.List;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Coin;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.State;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.VendingMachineStates.IdleState;

public class VendingMachine {

    private State vendingMachinState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachinState = new IdleState();
        inventory  = new Inventory(10);
        coinList =  new ArrayList<>();
    }

    public State getVendingMachinState() {
        return this.vendingMachinState;
    }

    public void setVendingMachinState(State vendingMachinState) {
        this.vendingMachinState = vendingMachinState;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return this.coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }


}
