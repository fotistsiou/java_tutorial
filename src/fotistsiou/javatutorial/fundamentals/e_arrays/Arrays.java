package fotistsiou.javatutorial.fundamentals.e_arrays;

public class Arrays {

    public static void main(String[] args) {
        /* Arrays */

        String[] carBrands = {"Toyota", "Hyundai", "Opel"};
        String[] carModels = {"Yaris", "i20", "Corsa"};
        String[][] cars = new String[3][2];

        for (int i = 0; i < 3; i++) {
            cars[i][0] = carBrands[i];
            cars[i][1] = carModels[i];
        }

        System.out.println("---- String Representation of the 'deep content' of the 'cars' array ----");
        System.out.println(java.util.Arrays.deepToString(cars));

        System.out.println("---- 1st way for print the values of an array ----");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Brand: " + cars[i][0] + ", Model: " + cars[i][1]);
        }

        System.out.println("---- 2nd way for print the values of an array ----");
        for (String[] car : cars) {
            System.out.println("Brand: " + car[0] + ", Model: " + car[1]);
        }

        System.out.println("---- 3rd way for print the values of an array ----");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        System.out.println("---- 4th way for print the values of an array ----");
        for (String[] car : cars) {
            for (String c : car) {
                System.out.println(c);
            }
        }
    }
}
