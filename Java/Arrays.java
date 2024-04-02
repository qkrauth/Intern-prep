public class Arrays {
    public static void main(String[] args) {

        String[] Teslas = {"Model 3", "Model Y", "Model S", "Model X"};

        System.out.println(Teslas[0]);

        String[] Cars = new String[3];

        Cars[0] = "Ford";
        Cars[1] = "Nissan";
        Cars[2] = "BMW";

        for(int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }
    }
}
