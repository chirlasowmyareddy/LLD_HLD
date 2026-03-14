package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern;

import java.util.List;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.Item;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public abstract class State {

        public void clickOnInsertCoinButton(VendingMachine machine){
            //by default nothing happens here
        }

        public void updateInventory(VendingMachine vendingMachine,Item item,int codeNumber){
            //by default nothing happens here
        }

        public List<Coin> refundFullMoney(VendingMachine vendingMachine){
            //by default nothing happens here
            return null;
        }

        public Item dispenseProduct(VendingMachine vendingMachine,int codeNumber){
            //by default nothing happens here
            return null;
        }

        public int getChange(int returnChangeMoney){
            //by default nothing happens here
            return 0;
        }

        public void chooseProduct(VendingMachine vendingMachine,int codeNumber){
            //by default nothing happens here
        }

        public void insertCoin(VendingMachine vendingMachine,Coin coin){
            // by default nothing happens
        }

        public void clickOnStartProductSelectionButton(VendingMachine machine){
            // by default nothing happens
        }

}
