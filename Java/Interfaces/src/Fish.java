public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("The fish flees the scene");
    }

    @Override
    public void flee() {
        System.out.println("The fish hunts the prey");
    }
}
