package se.lexicon;

import java.util.Scanner;

public class LoginSim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Sign-in credentials
        String username, password;
        boolean loggedIn = false;

        while(!loggedIn){
            System.out.print("Enter Username: ");
            username = scanner.next();
            System.out.print("Enter Password: ");
            password = scanner.next();


            //Verify credentials
            if (username.equals("admin") && password.equals("Pass123")){
                loggedIn = true;
                System.out.println("Login Successfully, Welcome to Food Order App");
            }else {
                System.out.println("Incorrect Credentials, Try Again!");
            }
        }



        /*
        - Present a Menu
        - Make a choice of item
        - Sign-out
        */

        boolean isContinue;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Pizza");
            System.out.println("3. Log Out");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("You ordered a Burger!");
                    isContinue = true;
                    break;
                case 2:
                    System.out.println("You ordered a Pizza!");
                    isContinue = true;
                    break;
                case 3:
                    System.out.println("Logging Out... Thank you!");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please Try again.");
                    isContinue = true;
            }

        }while(isContinue);

    }


}
