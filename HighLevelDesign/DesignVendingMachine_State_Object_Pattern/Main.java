package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern;

import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.Item;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.ItemShelf;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.ItemType;
import LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context.VendingMachine;

public class Main {
    
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("|");
        System.out.println("filling up the inventory");
        System.out.println("|");

        fillUpInventory(vendingMachine);
        displayInventory(vendingMachine);

        System.out.println("|");
        System.out.println("clicking on InsertCoinButton");
        System.out.println("|");

        State vendingState = vendingMachine.getVendingMachinState();
        vendingState.clickOnInsertCoinButton(vendingMachine);

        vendingState = vendingMachine.getVendingMachinState();
        vendingState.insertCoin(vendingMachine, Coin.NICKEL);
        vendingState.insertCoin(vendingMachine, Coin.QUARTER);

        System.out.println("|");
        System.out.println("clicking on ProductSelectionButton");
        System.out.println("|");

        vendingState.clickOnStartProductSelectionButton(vendingMachine);

        vendingState = vendingMachine.getVendingMachinState();
        try {
            vendingState.chooseProduct(vendingMachine, 102);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        displayInventory(vendingMachine);           
    }
        
    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }

    }
        
    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }


    }
        
}
