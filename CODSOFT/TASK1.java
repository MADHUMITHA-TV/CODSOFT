import java.util.Random;
import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Game!");

        int maxAttempts = 5;

        System.out.println("Enter the number of rounds you want to play: ");
        int totalRounds = sc.nextInt();

        int totalScore = 0;

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nRound " + round + " begins ...");

            int randomNumber = 1 + random.nextInt(100);
            int attemptsLeft = maxAttempts;

            System.out.println("I've generated a random number between 1 and 100. Try to guess it!");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess (" + attemptsLeft + " attempts left): ");
                int userGuess = sc.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    int score = attemptsLeft * 10;
                    System.out.println("Your score for this round: " + score);
                    totalScore += score;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attemptsLeft--;
            }

            if (attemptsLeft == 0) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Round " + round + " is over. Your total score so far: " + totalScore);
        }

        System.out.println("\nAll rounds are over. Your final total score: " + totalScore);
        System.out.println("Thank you for playing the Number Guessing Game!");
        sc.close();
    }
}