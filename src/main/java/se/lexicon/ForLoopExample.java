package se.lexicon;

public class ForLoopExample {

    public static void main(String[] args) {
        //Syntax: for(initialization; condition; increment/decrement)

        for(int i = 1; i <= 5; i++){
            System.out.println("Interation " + i);
        }

        for (int i = 1; i <= 10;i++){
            if (i % 2 == 0){
                System.out.println("Number: " + i);
            }
        }


        for (int i = 1; i <= 10;i++){
            if (i == 8){
                System.out.println("Skipping printing number 8");
                continue;
            }
            System.out.println("Number: " + i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Stopping at number 8...");
                break;
            }
            System.out.println("Number: " + i);
        }

        //For-Each Loop?
    }
}
