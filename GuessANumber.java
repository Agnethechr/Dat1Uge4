import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read user input
        if (scanner.hasNextDouble()) {
            //use hasNextDouble to check if input is numeric, 
            double userGuess = scanner.nextDouble();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            //   Compare it with the random number
            //   Let the user know the result of the comparison
            } else if (userGuess == rnd_number) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                // Provide a hint whether the guess was lower or higher
                if (userGuess < rnd_number) {
                    System.out.println("Try again. The number is higher.");
                } else {
                    System.out.println("Try again. The number is lower.");
                }
                
                // Ask for another guess by calling this method recursively
                makeAGuess();
            }
        } else {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Consume invalid input
            makeAGuess();   // Ask for another guess
        }

        // Close the scanner
        scanner.close();
    }
}


