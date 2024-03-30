import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.print("Number of rows?: ");
        rows = scanner.nextInt();
        System.out.print("Number of columns?: ");
        columns = scanner.nextInt();
        System.out.print("Enter a symbol: ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++) {
            System.out.println();
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
        System.out.println();
    }
}
