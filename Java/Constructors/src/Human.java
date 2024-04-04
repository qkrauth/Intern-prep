public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(this.name + " is eating food (hopefully)");
    }

    public void drink() {
        System.out.println(this.name + " sips the lean");
    }
}
