public class StringMethods {
    public static void main(String[] args) {

        String name = "Quinten";

        boolean result = name.equals("Quinten");
        System.out.println(result);

        int resulttwo = name.length();
        System.out.println(resulttwo);

        char resultthree = name.charAt(0);
        System.out.println(resultthree);

        int resultfour = name.indexOf("Q");
        System.out.println(resultfour);

        boolean resultfive = name.isBlank();
        System.out.println(resultfive);

        String resultsix = name.toUpperCase();
        System.out.println(resultsix);

        String resultseven = name.replace("n", "p");
        System.out.println(resultseven);
    }
}
