public class Main {
    public static void main(String[] args) {
        // encapsulation = attributes of a class that are private, can only be accessed by getters and
        // setters

        Car car = new Car("Tesla", "Model 3", 2020);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setModel("Model S");
        car.setYear(2023);
        System.out.println();

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
