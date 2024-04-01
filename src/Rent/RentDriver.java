package Rent;

import java.util.Scanner;

public class RentDriver {

    static {
        System.out.println("Rent with Ease, Anywhere, Anytime!");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Menu menu = new Menu(inventory);
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Signup");
        System.out.println("2.login");
        System.out.println("3.Guess access");
        System.out.println("4.Exit");
        System.out.println("Enter your choice :");

        Menu m = new Menu(inventory);

        int choice = sc.nextInt();

        int categoryChoice = 0;
        switch (choice) {
            case 1 -> {
                m.signup();
            }
            case 2 -> {
                m.login();
            }
            case 3 -> {
                System.out.println("Welcome to RentEaseApp ");
                System.out.println("You're using Guest Mode");
                System.out.println("===========================");
                categoryChoice = m.ItemList();
                String categoryName;
                switch (categoryChoice) {
                    case 1:
                        categoryName = "Electronics";
                        m.ElectronicsMenu();
                        break;
                    case 2:
                        categoryName = "Rental Properties";
                        break;
                    case 3:
                        categoryName = "Clothes";
                        break;
                    case 4:
                        categoryName = "Vehicles";
                        break;
                    case 5:
                        categoryName = "Home Decor";
                        break;
                    case 6:
                        categoryName = "Books";
                        break;
                    case 7:
                        categoryName = "GoBack";
                        System.exit(0);


                    default:
                        categoryName = "Unknown";
                        break;
                }
                System.out.println("You chose: " + categoryName);
            }
            case 4 -> {
                System.out.println("Thank you ! Visit Again");
                System.exit(0);
            }
            default -> {
                System.err.println("enter valid input");
                main(null);
            }
        }




    }

}