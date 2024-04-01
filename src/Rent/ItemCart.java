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

    public void bookItem(int index) {
        RentalItem item = CartList.get(index);
        if (item.getAvailability()) {
            item.setAvailability(false);
            System.out.println("Booking successful for item: " + item.getName());
        } else {
            System.out.println("Item " + item.getName() + " is already booked.");
        }
    }

    public void cancelBooking(int index) {
        RentalItem item = CartList.get(index);
        item.setAvailability(true);
        System.out.println("Booking canceled for item: " + item.getName());
    }
}
