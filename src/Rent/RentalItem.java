package Rent;

public class RentalItem {
    private String category;
    private String name;
    private String description;
    private double price;

    private boolean availability;

    public RentalItem(String category, String name, String description, double price, boolean availability){
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability=availability;


    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

