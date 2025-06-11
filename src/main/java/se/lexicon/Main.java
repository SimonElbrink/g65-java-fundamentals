package se.lexicon;


// Special type of comment used to generate documentation.

/**
 * Demo add things together! 😊
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


        int age = 3;

        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are NOT eligible to vote!");
        }

        int marks = 68;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 55 || marks <= 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }


        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // The break statement is used to exit the switch block after a matching case has been executed.
            // Without break, execution will continue to the subsequent cases (known as "fall-through").

            default:
                System.out.println("Invalid Day");

        }

        // Use if for Simple Decisions - when you need to evaluate a single condition.

        // Use if-else for Two-Way Decisions - when you have one condition and an alternative.

        // Use if-else-if Ladder for Multiple Conditions - when multiple conditions need to be checked in sequence.

        // Use switch for Multiple Fixed Values:
        // Use switch when comparing a variable against specific fixed values.


        // ### Java String ###

//        String firstName = "Simon";
//        String lastName = "Elbrink";
////        String fullName = firstName + " " + lastName;
//        String fullName = firstName.concat(" " + lastName);
//
//        System.out.println("fullName = " + fullName);


        String greeting = "Hello";

//        greeting.concat(" World");
        greeting = greeting.concat(" World");

        System.out.println("greeting = " + greeting);

        // https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/garbage_collect.html
        // https://www.geeksforgeeks.org/storage-of-string-in-java/


        String str1 = "Simon"; //Instance 1 or Object 2
        String str2 = "OCP"; // instance 2 or object 2

        System.out.println(str1.toUpperCase());
        System.out.println(str1);


        // ### Object ###

        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.age = 28;
        simon.hobby = "Programming";

        Person mehrdad = new Person();
        mehrdad.firstName = "Mehrdad";
        mehrdad.lastName = "Javan";
        mehrdad.age = 40;
        mehrdad.hobby = "Programming";


        Person tobias = new Person();
        tobias.firstName = "Tobias";
        tobias.lastName = "Engberg";
        tobias.age = 47;
        tobias.hobby = "Coding Books";


        System.out.println(simon.getInformation());
        System.out.println(mehrdad.getInformation());
        System.out.println(tobias.getInformation());

        // ** Method and For-Loop example have been moved to separate file. **



    }

}