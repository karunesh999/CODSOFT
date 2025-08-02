import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 5;
        int score = 0;

        System.out.println("=== Welcome to Number Guessing Game ===");

        boolean playAgain;
        do {
            int target = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("Can you guess it? You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempt(s).");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("Oops! The correct number was: " + target);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\nGame Over. Your score: " + score);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
