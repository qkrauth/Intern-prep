import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        intro();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String response = "";

        do {
            int cpuGuess = random.nextInt(100) + 1;

            while (true) {
                System.out.print("Guess a number! (1-100): ");
                int playerGuess = scanner.nextInt();

                if (playerGuess == cpuGuess) {
                    System.out.println("YOU GUESSED IT! the number was " + cpuGuess);
                    break;
                } else if (playerGuess > cpuGuess) {
                    System.out.println("too high.");
                } else {
                    System.out.println("too low.");
                }
            }
        }
        while (response.equals("y"));

        System.out.print("Care to play again? (y for yes): ");
        response = scanner.next();

    }

    public static void intro() {
        System.out.println("*                                    *");
        System.out.println("Welcome to Higher or Lower! (THE GAME)");
        System.out.println("*                                    *");
    }
}
