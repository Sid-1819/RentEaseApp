package Rent;

import java.util.Scanner;

public class Menu {
    private String fname;
    private String lname;
    private String address;
    private String email;
    private String password;
    private long mno;
    Scanner sc=new Scanner(System.in);

    // Setters
    public void set_fname(String fname) {
        this.fname=fname;
    }
    public void set_lname(String lname) {
        this.lname=lname;
    }
    public void set_address(String address) {
        this.address= address;
    }
    public void set_email(String email) {
        this.email=email;
    }
    public void set_password(String password) {
        this.password=password;
    }
    public void set_mno() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mobile");
        long mno =sc.nextLong();

        if (mno >999999999 && mno<10000000000L) {
            this.mno=mno;
        }else {
            System.err.println("Enter 10 digit mobile number ");
            set_mno();
        }
    }

    // Getters
    public String get_fname() {
        return this.fname;
    }
    public String get_lname() {
        return this.lname;
    }
    public String get_address() {
        return this.address;
    }
    public String get_email() {
        return this.email;
    }
    public String get_password() {
        return this.password;
    }
    public long get_mno() {
        return this.mno;
    }



    public void signup() {

        System.out.println("Enter first name:");
        String fname= sc.next();
        set_fname(fname);

        System.out.println("Enter last name:");
        String lname=sc.next();
        set_lname(lname);
        sc.nextLine();

        System.out.println("Enter Your Address");
        String address= sc.nextLine();
        set_address(address);

        System.out.println("Enter your Mail id");
        String email =sc.next();
        set_email(email);

        System.out.println("Enter the Password");
        String password =sc.next();
        set_password(password);

        set_mno();

        System.out.println("Signup Successful");
        System.out.println("proceed to login");
        login();

    }

    public void login() {
        if(fname != null) {

            System.out.println("Enter your choice ");
            System.out.println("1.Login with registered mobile ");
            System.out.println("2.Login with email id");
            int a =sc.nextInt();
            if(a==1){
                System.out.println("Enter registered mobile");
                long mno =sc.nextLong();
                System.out.println("Enter your password");
                String pwd =sc.next();

                if(this.mno== mno && this.password.equals(pwd)) {
                    System.out.println("Login Successful");
                }else {
                    System.out.println("Invalid Mobile or password");
                    login();
                }
            }else if(a==2) {
                System.out.println("Enter your Email id");
                String email=sc.next();
                System.out.println("Enter yor password");
                String pwd=sc.next();

                if(this.email.equals(email) && this.password.equals(pwd)) {
                    System.out.println("Login Successful");
                }else {
                    System.out.println("Invalid Email or password");
                    login();
                }
            }else {
                System.out.println("invalid input");
                login();
            }
        }else {
            System.out.println("First create account");
            signup();
        }
    }

    public int ItemList() {
        System.out.println("=================================");
        System.out.println("Enter your choice: ");
        System.out.println("1. Electronics: ");
        System.out.println("2. Rental Properties: ");
        System.out.println("3. Clothes: ");
        System.out.println("4. Vehicles: ");
        System.out.println("5. Home Decor: ");
        System.out.println("6. Books");
        System.out.println("7. Go Back");



        System.out.print("Enter the category number: ");

        int categoryNumber = sc.nextInt();


        return categoryNumber;
    }
}
