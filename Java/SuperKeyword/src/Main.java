public class Main {
    public static void main(String[] args) {
        // super = this keyword refers to the superclass

        Hero hero = new Hero("Superman", 1000, "All of em");
        Hero savior = new Hero("Batman", 40, "Rich and white");

        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        System.out.println();

        System.out.println(savior.toString());
    }
}
