public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        char[] characters = new char[4];
//        String[] strings = new String[5];

        Food[] fridge = new Food[3];

        Food food = new Food("pizza");
        Food snack = new Food("burger");
        Food meal = new Food("sushi");

        fridge[0] = food;
        fridge[1] = snack;
        fridge[2] = meal;

        System.out.println(fridge[0].name);

    }
}
