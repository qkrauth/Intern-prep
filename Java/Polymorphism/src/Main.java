public class Main {
    public static void main(String[] args) {
        // polymorphism = the ability of an object to identify as more than one type

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle i : racers) {
            i.go();
        }
    }
}
