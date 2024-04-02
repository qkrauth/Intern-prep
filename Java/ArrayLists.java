import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList = a re-sizable Array
        // Wrapper classes MUST BE USED when making ArrayLists

        ArrayList<String> Foods = new ArrayList<String>();

        Foods.add("Pizza");
        Foods.add("Burger");
        Foods.add("Curry");

        Foods.set(0, "Sushi");
        Foods.remove(2);
        // Foods.clear(); -> clears the ArrayList

        for(int i = 0; i < Foods.size(); i++) {
            System.out.println(Foods.get(i));
        }
    }
}
