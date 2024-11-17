package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methodsBuiltIn;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 * Built-In Methods - Rounding Numbers
 * -----------------------------------
 * There are several ways to round numbers:
 * 1. String.format()
 * 2. System.out.format()
 * 3. System.out.printf()
 * 4. Math Class
 * 5. DecimalFormat Class
 * 6. BigDecimal Class
 */

public class BuiltInMethodsRoundingNumbers {

    public static void main(String[] args) {
        double double1 = 12.34;
        double double2 = 5.67;
        double division = double1 / double2;

        // Display the division result without rounding
        System.out.print("Division without round: ");
        System.out.println(division);

        // 1. String.format()
        System.out.print("Division with String.format() - Rounding to 2 decimal places: ");
        System.out.println(String.format("%.2f", division));

        // 2. System.out.format()
        System.out.print("Division with System.out.format() - Rounding to 2 decimal places: ");
        System.out.format("%.2f%n", division);

        // 3. System.out.printf()
        System.out.print("Division with System.out.printf() - Rounding to 2 decimal places: ");
        System.out.printf("%.2f%n", division);

        // 4. Math Class
        // -> Math.round() for rounding to integer
        System.out.print("Division with Math Class - Math.round() - Rounding to integer: ");
        System.out.println(Math.round(division));
        // -> Math.round() for rounding to 2 decimal places
        System.out.print("Division with Math Class - Math.round() - Rounding to 2 decimal places: ");
        System.out.println(Math.round(division * 100) / 100);
        // -> Math.ceil() for rounding to integer
        System.out.print("Division with Math Class - Math.ceil() - Rounding to integer: ");
        System.out.println(Math.ceil(division));
        // -> Math.floor() for rounding to integer
        System.out.print("Division with Math Class - Math.floor() - Rounding to integer: ");
        System.out.println(Math.floor(division));

        // 5. DecimalFormat Class
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // -> decimalFormat.format() & RoundingMode.HALF_EVEN (Default) for rounding to 2 decimal places
        System.out.print("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.HALF_EVEN (Default) - Rounding to 2 decimal places: ");
        System.out.println(decimalFormat.format(division));
        // -> decimalFormat.format() & RoundingMode.DOWN for rounding to 2 decimal places
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.print("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.DOWN - Rounding to 2 decimal places: ");
        System.out.println(decimalFormat.format(division));
        // -> decimalFormat.format() & RoundingMode.UP for rounding to 2 decimal places
        decimalFormat.setRoundingMode(RoundingMode.UP);
        System.out.print("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.UP - Rounding to 2 decimal places: ");
        System.out.println(decimalFormat.format(division));

        // 6. BigDecimal Class
        BigDecimal bigDecimal = new BigDecimal(division);
        // -> bigDecimal.setScale() & RoundingMode.HALF_UP for rounding to 2 decimal places
        BigDecimal bigDecimalUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.print("Division with BigDecimal Class - bigDecimal.setScale() - RoundingMode.HALF_UP - Rounding to 2 decimal places: ");
        System.out.println(bigDecimalUp);
        // -> bigDecimal.setScale & RoundingMode.HALF_DOWN for rounding to 2 decimal places
        BigDecimal bigDecimalDown = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.print("Division with BigDecimal Class - bigDecimal.setScale - RoundingMode.HALF_DOWN - Rounding to 2 decimal places: ");
        System.out.println(bigDecimalDown);
    }
}