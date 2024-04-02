import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // For each loop is the same thing as enhanced for loop

        String[] Animals = {"Dog", "Cat", "Bird", "Mouse"};

        // This reads as (data type)(String) i (in)(:) Animals (Array)
        for(String i : Animals) {
            System.out.println(i);
        }
        System.out.println();

        ArrayList<String> Cars = new ArrayList<String>();

        Cars.add("Sedan");
        Cars.add("Coupe");
        Cars.add("Hybrid");
        Cars.add("SUV");

        for(String i : Cars) {
            System.out.println(i);
        }
    }
}
