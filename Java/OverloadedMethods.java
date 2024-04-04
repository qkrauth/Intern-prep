public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters

        int x = add(2, 2);
        System.out.println(x);

        int y = add(1, 2, 3);
        System.out.println(y);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return  a + b + c;
    }
}
