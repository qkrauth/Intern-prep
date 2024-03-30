import java.util.Scanner;

public class LogicalOps {
    public static void main(String[] args) {
//    && = AND
//    || = OR
//    ! = NOT
        int temp = 45;

        if (temp > 80) {
            System.out.println("It is hot outside");
        }
        else if (temp >= 60 && temp <= 80) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is neither hot or warm outside, pls infer the rest");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game, pres q or Q to quit");
        String response = scanner.nextLine();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You have quit the game");
        }
        else {
            System.out.println("You are still playing");
        }

    }
}
