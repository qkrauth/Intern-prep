public class Main {
    public static void main(String[] args) {
        // inheritance = one class acquires the attributes and methods of another

        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.stop();

        System.out.println(car.wheels);
        System.out.println(bike.wheels);

    }
}
