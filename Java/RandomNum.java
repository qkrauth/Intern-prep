import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(20) + 1;
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
