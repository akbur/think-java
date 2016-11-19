import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number, guess, difference;

        // pick a random number
        number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        guess = in.nextInt();
        difference = Math.abs(guess - number);

        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was thinking of is: %d\n", number);
        System.out.printf("You were off by: %d\n", difference);

    }

}