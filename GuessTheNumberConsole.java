import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // 1–100
        int attempts = 0;
        int guess = 0;

        System.out.println("🎯 Welcome to Guess The Number Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            if (!sc.hasNextInt()) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("📉 Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("✅ Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
