public class Main {
    public static void main(String[] args) {
        // abstraction = abstract classes cant be instantiated, but they can have a subclass
        // that can be, methods are then declared without an implementation

        // Vehicle vehicle = new Vehicle();
        // a new Vehicle cannot be declared since it is abstract

        Car car = new Car();

        car.go();

    }
}
