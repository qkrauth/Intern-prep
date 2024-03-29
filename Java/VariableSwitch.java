public class VariableSwitch {
    public static void main(String[] args) {

        String x = "Water";
        String y = "Milk";
        String temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
