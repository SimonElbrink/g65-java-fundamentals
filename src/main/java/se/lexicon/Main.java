package se.lexicon;


// Special type of comment used to generate documentation.
/**
 * Hello World
 */
public class Main {

    // This is a single line comment

    /* This is a regular multi-line comment
    * It spans multiple lines
    */

    /**
     * This is a Java Doc ( Documentation Comments ).
     * Used to create documentation for Java code.
     * These comments are processed by the Javadoc tool to generate HTML documentation for your program.
     * https://www.baeldung.com/javadoc
     */


    public static void main(String[] args) {

//        System.out.println("Hello Group 56");


        // ### Variable Declaration ###
        // syntax:  [Data Type] [variableName] = [value];

        int speed;
        speed = 100;
//        System.out.println(speed);

        double salary = 5000.75;
        char grade = 'A';
        char specialChar = '\u2764';
        boolean isAdult = true;

        long balance = 5000000000000000000L;
        float radius = 5.5f;
        double area = 25.22; //25.22d
        byte temperature = 19;

        int width = 10, height = 5; // could have multiple decorations on one line.

        int SeatNumber; // Incorrect (Avoid starting with uppercase)
        int seatNumber; // Correct (Follow Camel Case)

        // Avoid starting with numbers or special characters.
//        int 1var = 10;
//        int &var = 10;
        int _temp = 5; // Allowed, but not recommended

        // int class = 5;  // Incorrect (Don’t use Java's reserved keywords )
        int studentClass = 5; // Correct


        // ### Assignment Operator (=) ###
        // The assignment operator assigns the value on the right-hand side to the variable on the left-hand side.

        int number1 = 10;
        int number2 = 5;

        number1 = number2;

        System.out.println(number1);
        System.out.println(number2);


        // ### Arithmetic Operators(+  -  * /) ###
        int numberOne = 10;
        int numberTwo = 5;

        int additionResult = numberOne + numberTwo;
        int subtractionResult = numberOne - numberTwo;
        int multiplicationResult = numberOne * numberTwo;

        double division = numberOne / numberTwo;

        int modules = numberOne % numberTwo; // Modulus operator Calculates the remainder of the division.


        int number = 0;
//        ++number;
//        number = number + 1;

        // Pre-Increment/Pre-Decrement: ++number or --number
//        System.out.println(--number);

        // Post-Increment/Post-Decrement:
        System.out.println(number++);
//        System.out.println(number);

        //Pre-Increment/Decrement: Updates the value first, then uses it.
        //Post-Increment/Decrement: Uses the value first, then updates it.


        // ### Comparison Operators: (==, !=, <, >, <=, >=) ###

        int a = 10, b = 10;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));




    }

}