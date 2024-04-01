package Rent;

import java.util.ArrayList;
import java.util.List;

public class ItemCart {
private List<RentalItem> CartList;

public ItemCart(){
   this.CartList = new ArrayList<>();
}

public void addItem(RentalItem item){
    CartList.add(item);
}
    public void updateItem(int index, RentalItem item){
    CartList.set(index,item);
    }

    public void deleteItem(int index){
    CartList.remove(index);
    }

    public void showItem(){
        for (RentalItem item: CartList) {
            System.out.println(item.toString());
        }
    }
}
