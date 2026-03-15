package LLD_HLD.HighLevelDesign.DesignVendingMachine_State_Object_Pattern.Context;

public class Inventory {

    ItemShelf[] inventory  = null;

    public Inventory(int ItemCount) {
        inventory = new ItemShelf[ItemCount];
        initialEmptyInventory();
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]= space;
            startCode++;
        }
    }


    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf shelf : inventory){
            if(shelf.getCode() == codeNumber){
                if(shelf.isSoldOut()){
                    shelf.item= item;
                    shelf.setSoldOut(false);
                }else {
                    throw new Exception("already item is present, you can not add item here");
                }

            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for(ItemShelf shelf : inventory){
            if(shelf.code == codeNumber){
                shelf.setSoldOut(true);
            }
        }
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

}
