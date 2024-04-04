public class Methods {
    public static void main(String[] args) {
    // method = a block of code that is executed whenever it is called upon

        String name = "Quinten";
        int age = 25;
        hello(name, age);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
}
