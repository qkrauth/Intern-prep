import java.util.Random;
import java.util.Scanner;

public class DiceMatcher {
    public static void main(String[] args) {

        String response = "";

        do {
            intro();
            System.out.println("Hello user, today's goal is to roll the same number as the cpu");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Are you ready to play? (press 'y'): ");
            String opener = scanner.next();
            System.out.println();

            Random random = new Random();

            if (opener.equals("y")) {
                int playerRoll = random.nextInt(6) + 1;
                int cpuRoll = random.nextInt(6) + 1;

                System.out.println("You rolled a: " + playerRoll);
                System.out.println("The cpu rolled a: " + cpuRoll);

                if (playerRoll == cpuRoll) {
                    System.out.println("YOU WIN!");
                } else {
                    System.out.println("YOU LOSE!");
                }
            } else {
                System.out.println("Oh well, guess we arent gonna play then. log off then lil bro");
            }

            System.out.println();
            System.out.print("Care you try your luck again? (y for yes): ");
            response = scanner.next();
        }
        while (response.equals("y"));
    }

    public static void intro() {
        System.out.println("*                      *");
        System.out.println("Welcome to Roll Wizards!");
        System.out.println("*                      *");
    }
}
