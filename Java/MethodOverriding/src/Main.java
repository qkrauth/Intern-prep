public class Main {
    public static void main(String[] args) {
        // method overriding = declare a method in a subclass that is already present in the parent class
        // this is done so that a child class can have its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }
}
