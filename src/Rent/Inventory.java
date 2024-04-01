package Rent;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<RentalItem> items;

    public Inventory() {
        items = new ArrayList<>();
        addItems();
    }

    private void addItems() {
        addLaptops();
        addSmartPhones();
        addTV();
        addAC();

    }

    private void addAC() {
        items.add(new Electronics.AirConditioner("Electronics", "Daikin Inverter AC", "An energy-efficient inverter air conditioner", 1000.00));
        items.add(new Electronics.AirConditioner("Electronics", "Voltas Split AC", "A popular split air conditioner model", 800.00));
    }

    private void addTV() {
        items.add(new Electronics.SmartTV("Electronics", "Sony Bravia 4K", "A high-resolution 4K smart TV with HDR support", 1500.00));
        items.add(new Electronics.SmartTV("Electronics", "LG OLED CX", "An OLED TV known for its deep blacks and vibrant colors", 2000.00));
    }

    private void addSmartPhones() {
        items.add(new Electronics.Smartphone("Electronics", "iPhone 12", "The latest iPhone model with advanced features", 1200.00));
        items.add(new Electronics.Smartphone("Electronics", "Samsung Galaxy S21", "A high-performance Android smartphone", 1100.00));
    }

    private void addLaptops() {
        items.add(new Electronics.Laptop("Electronics","HP Spectre x360","The MacBook Pro 16-inch (2021) packs up to 64GB RAM, 8TB storage, and an Apple M1 Pro/Max chip for exceptional performance. Its 16-inch Retina display and 11-hour battery life make it perfect for professionals.",100.00));
        items.add(new Electronics.Laptop("Electronics","HP Spectre x3601","The MacBook Pro 16-inch (2021) packs up to 64GB RAM, 8TB storage, and an Apple M1 Pro/Max chip for exceptional performance. Its 16-inch Retina display and 11-hour battery life make it perfect for professionals.",1000.00));
        items.add(new Electronics.Laptop("Electronics","HP Spectre x3602","The MacBook Pro 16-inch (2021) packs up to 64GB RAM, 8TB storage, and an Apple M1 Pro/Max chip for exceptional performance. Its 16-inch Retina display and 11-hour battery life make it perfect for professionals.",1000.00));
        items.add(new Electronics.Laptop("Electronics","HP Spectre x3603","The MacBook Pro 16-inch (2021) packs up to 64GB RAM, 8TB storage, and an Apple M1 Pro/Max chip for exceptional performance. Its 16-inch Retina display and 11-hour battery life make it perfect for professionals.",1000.00));
    }


    public List<RentalItem> getItemsByCategory(String category) {
        List<RentalItem> itemsByCategory = new ArrayList<>();
        for (RentalItem item : items) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                itemsByCategory.add(item);
            }
        }
        return itemsByCategory;
    }
}
