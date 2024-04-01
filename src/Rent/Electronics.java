package Rent;

public class Electronics extends RentalItem {
    public Electronics(String category, String name, String description, double price) {
        super(category, name, description, price);
    }

    static class Laptop extends Electronics {
        public Laptop(String category, String name, String description, double price) {
            super(category, name, description, price);
        }
    }

    static class Smartphone extends Electronics {
        public Smartphone(String category, String name, String description, double price) {
            super(category, name, description, price);
        }
    }

    static class SmartTV extends Electronics {
        public SmartTV(String category, String name, String description, double price) {
            super(category, name, description, price);
        }
    }
    static class AirConditioner extends Electronics{

        public AirConditioner(String category, String name, String description, double price) {
            super(category, name, description, price);
        }
    }


}
