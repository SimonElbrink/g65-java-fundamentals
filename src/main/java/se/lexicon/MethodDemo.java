package se.lexicon;

public class MethodDemo {

    public static void main(String[] args) {
        printMenu();
        printMessage("Sum: " + add(2, 5));
    }


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void printMessage(String message) {
        System.out.println("\u001B[34m" + message + "\u001B[0m");
    }

    public static void printMenu() {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        System.out.println(GREEN + "Welcome to My App" + RESET);
        System.out.println(GREEN + "1. Addition" + RESET);
        System.out.println(GREEN + "2. Subtraction" + RESET);
        System.out.println(GREEN + "3. Exit" + RESET);
    }

}
