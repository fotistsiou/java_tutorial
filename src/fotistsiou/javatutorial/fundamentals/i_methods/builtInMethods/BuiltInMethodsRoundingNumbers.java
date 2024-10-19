package fotistsiou.javatutorial.fundamentals.i_methods.builtInMethods;

/* Built-In Methods - Rounding Numbers */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class BuiltInMethodsRoundingNumbers {

    /**
     * The main method performs a division of two double values and demonstrates
     * different rounding techniques, showing results for both rounding to integer
     * values and rounding to two decimal places.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        double double1 = 12.34;
        double double2 = 5.67;
        double division = double1 / double2;

        // Display the division result without rounding
        System.out.println("Division without round: " + division);

        // 1st way - String.format() for rounding to 2 decimal places
        System.out.println("Division with String.format() - Rounding to 2 decimal places: " + String.format("%.2f", division));

        // 2nd way - System.out.format() for rounding to 2 decimal places
        System.out.format("Division with System.out.format() - Rounding to 2 decimal places: %.2f\n", division);

        // 3rd way - System.out.printf() for rounding to 2 decimal places
        System.out.printf("Division with System.out.printf() - Rounding to 2 decimal places: %.2f\n", division);

        // 4th way - Math Class
        // -> Math.round() for rounding to integer
        System.out.println("Division with Math Class - Math.round() - Rounding to integer: " + Math.round(division));
        // -> Math.round() for rounding to 2 decimal places
        System.out.println("Division with Math Class - Math.round() - Rounding to 2 decimal places: " + (Math.round(division * 100) / 100));
        // -> Math.ceil() for rounding to integer
        System.out.println("Division with Math Class - Math.ceil() - Rounding to integer: " + Math.ceil(division));
        // -> Math.floor() for rounding to integer
        System.out.println("Division with Math Class - Math.floor() - Rounding to integer: " + Math.floor(division));

        // 5th way - DecimalFormat Class
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // -> decimalFormat.format() & RoundingMode.HALF_EVEN (Default) for rounding to 2 decimal places
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.HALF_EVEN (Default) - Rounding to 2 decimal places: " + decimalFormat.format(division));
        // -> decimalFormat.format() & RoundingMode.DOWN for rounding to 2 decimal places
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.DOWN - Rounding to 2 decimal places: " + decimalFormat.format(division));
        // -> decimalFormat.format() & RoundingMode.UP for rounding to 2 decimal places
        decimalFormat.setRoundingMode(RoundingMode.UP);
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.UP - Rounding to 2 decimal places: " + decimalFormat.format(division));

        // 6th way - BigDecimal Class
        BigDecimal bigDecimal = new BigDecimal(division);
        // -> bigDecimal.setScale() & RoundingMode.HALF_UP for rounding to 2 decimal places
        BigDecimal bigDecimalUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Division with BigDecimal Class - bigDecimal.setScale() - RoundingMode.HALF_UP - Rounding to 2 decimal places: " + bigDecimalUp);
        // -> bigDecimal.setScale & RoundingMode.HALF_DOWN for rounding to 2 decimal places
        BigDecimal bigDecimalDown = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Division with BigDecimal Class - bigDecimal.setScale - RoundingMode.HALF_DOWN - Rounding to 2 decimal places: " + bigDecimalDown);
    }
}