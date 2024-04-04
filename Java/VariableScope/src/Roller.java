import java.util.Random;

public class Roller {

    Random random;
    int number;

    public Roller() {
        random = new Random();
        roll();
    }

    public void roll() {
        number = random.nextInt(6) + 1;
        System.out.println("You rolled a " + number);
    }
}
