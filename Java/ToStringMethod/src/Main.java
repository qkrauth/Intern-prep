public class Main {
    public static void main(String[] args) {
        // method that returns a string that represents an object through text

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println();

        System.out.println(car.toString());
    }
}
