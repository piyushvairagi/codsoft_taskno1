import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void  main(String[] args) {
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int roundsWon = 0;
        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("New game started! Guess a number between " + min + " and " + max + ".");
            int attempt = 1;
            boolean guessedCorrectly = false;
            while (attempt <= maxAttempts && !guessedCorrectly) {
                System.out.print("Guess #" + attempt + ": ");
                int userGuess = scanner.nextInt();
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                attempt++;
            }
            if (guessedCorrectly) {
                roundsWon++;
            } else {
                System.out.println("Oops! You have reached the maximum number of attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("Game Over!");
        System.out.println("Rounds won: " + roundsWon);
        scanner.close();
    }
}