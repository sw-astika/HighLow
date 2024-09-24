import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0; // Player's guess
        int attempts = 0; // Number of attempts

        System.out.println("Welcome to the High-Low Game!");
        System.out.println("Guess a number between 1 and 100:");

        // Game loop
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // Get player's guess
            attempts++; // Increment attempts

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
