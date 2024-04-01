package Rent;

import java.util.Scanner;

public class RentDriver {

    static {
        System.out.println("Rent with Ease, Anywhere, Anytime!");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your choice :");
        System.out.println("1.Signup");
        System.out.println("2.login");
        System.out.println("3.Guess access");
        System.out.println("4.Exit");

        Menu m = new Menu();

        int choice =sc.nextInt();

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
                m.ItemList();
            }
            case 4 -> {
                System.out.println("Thankyou ! Visit Again");
                System.exit(0);
            }
            default -> {
                System.err.println("enter valid input");
                main(null);
            }
        }

    }

}