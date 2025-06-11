package se.lexicon;

public class MethodsExample {


    /**
     *
     * @see se.lexicon.MathOperations
     */
    public static void main(String[] args) {
        displayMenu();

        System.out.println(addition(30, 10));
        printSum(400, 20);

        System.out.println(celsiusToFahrenheit(28));
        System.out.println(fahrenheitToCelsius(90));

        System.out.println(MathOperations.add(40, 50));
    }

    public static void displayMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
