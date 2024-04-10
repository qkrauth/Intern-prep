import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        String[] options = {"r", "p", "s"};
        String playAgain = "";

        do {
            header();
            System.out.println();

            String playerMove = "";

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("What will you throw? ('r', 'p', 's'): ");
                playerMove = scanner.next();
            } while (!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s"));

            Random random = new Random();
            String cpuMove = "";

            cpuMove = (options[random.nextInt(3)]);

            System.out.println();
            System.out.println("You threw: " + playerMove);
            System.out.println("The cpu threw: " + cpuMove);

            if (playerMove.equals("r") && cpuMove.equals("s")) {
                System.out.println("YOU WIN");
            } else if (playerMove.equals("r") && cpuMove.equals("p")) {
                System.out.println("YOU LOSE");
            } else if (playerMove.equals("p") && cpuMove.equals("r")) {
                System.out.println("YOU WIN");
            } else if (playerMove.equals("p") && cpuMove.equals("s")) {
                System.out.println("YOU LOSE");
            } else if (playerMove.equals("s") && cpuMove.equals("p")) {
                System.out.println("YOU WIN");
            } else if (playerMove.equals("s") && cpuMove.equals("r")) {
                System.out.println("YOU LOSE");
            } else {
                System.out.println("ITS A TIE");
            }


            System.out.println();
            System.out.print("Care to play again? 'y' for yes: ");
            playAgain = scanner.next();
            System.out.println(playAgain);
        } while (playAgain.equals("y"));
    }

    public static void header() {
        System.out.println("*                                       *");
        System.out.println("Welcome to rock paper scissors mini game!");
        System.out.println("*                                       *");
    }
}
