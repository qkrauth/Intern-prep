public class Main {
    public static void main(String[] args) {
        // constructor = method that is called when an object is created

        Human human = new Human("Quinten", 25, 190.0);
        Human person = new Human("Tom", 15, 165.50);

        System.out.println(human.name);
        System.out.println(person.name);

        human.eat();
        person.drink();

    }
}
