public class Main {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods

        Car myCar = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        myCar.drive();
        myCar.brake();
    }
}
