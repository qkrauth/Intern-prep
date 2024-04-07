import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] options = {"r", "p", "s"};

        String cpuMove = options[new Random().nextInt(options.length)];

        Scanner scanner = new Scanner(System.in);
        String myMove;

        while(true) {
            System.out.print("Please enter your move ('r', 'p', or 's') only: ");
            myMove = scanner.next();

            if(myMove.equals("r") || myMove.equals("p") || myMove.equals("s")) {
                break;
            }
            System.out.println(myMove + "is not valid");
        }

        System.out.println("CPU plays: " + cpuMove);

        if(myMove.equals(cpuMove)) {
            System.out.println("It ends in a tie");
        }
        else if(myMove.equals("r")) {
            if(cpuMove.equals("p")) {
                System.out.println("You lose");
            }
            else if(cpuMove.equals("s")) {
                System.out.println("You win");
            }
        }

        else if(myMove.equals("p")) {
            if(cpuMove.equals("r")) {
                System.out.println("You win");
            }
            else if(cpuMove.equals("s")) {
                System.out.println("You lose");
            }
        }

        else if(myMove.equals("s")) {
            if(cpuMove.equals("p")) {
                System.out.println("You win");
            }
            else if(cpuMove.equals("r")) {
                System.out.println("You lose");
            }
        }
    }
}
