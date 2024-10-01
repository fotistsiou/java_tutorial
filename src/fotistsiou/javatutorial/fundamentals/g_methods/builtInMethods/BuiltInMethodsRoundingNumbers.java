package fotistsiou.javatutorial.fundamentals.g_methods.builtInMethods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class BuiltInMethodsRoundingNumbers {

    public static void main(String[] args) {
        /* Built-In Methods - Rounding Numbers */

        double double1 = 12.34;
        double double2 = 5.67;
        double division = double1 / double2;
        System.out.println("Division without round: " + division);

        // 1st way - String.format()
        System.out.println("Division with String.format() - Rounding to 2 decimal places: " + String.format("%.2f", division));

        // 2nd way - System.out.format()
        System.out.format("Division with System.out.format() - Rounding to 2 decimal places: %.2f\n", division);

        // 3rd way - System.out.printf()
        System.out.printf("Division with System.out.printf() - Rounding to 2 decimal places: %.2f\n", division);

        // 4th way - Math Class
        // -> Math.round()
        System.out.println("Division with Math Class - Math.round() - Rounding to integer: " + Math.round(division));
        System.out.println("Division with Math Class - Math.round() - Rounding to 2 decimal places: " + (Math.round(division * 100) / 100));
        // -> Math.ceil()
        System.out.println("Division with Math Class - Math.ceil() - Rounding to integer: " + Math.ceil(division));
        // -> Math.floor()
        System.out.println("Division with Math Class - Math.floor() - Rounding to integer: " + Math.floor(division));

        // 5th way - DecimalFormat Class
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // -> decimalFormat.format() - RoundingMode.HALF_EVEN (Default)
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.HALF_EVEN (Default) - Rounding to 2 decimal places: " + decimalFormat.format(division));
        // -> decimalFormat.format() - RoundingMode.DOWN
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.DOWN - Rounding to 2 decimal places: " + decimalFormat.format(division));
        // -> decimalFormat.format() - RoundingMode.UP
        decimalFormat.setRoundingMode(RoundingMode.UP);
        System.out.println("Division with DecimalFormat Class - decimalFormat.format() - RoundingMode.UP - Rounding to 2 decimal places: " + decimalFormat.format(division));

        // 6th way - BigDecimal Class
        BigDecimal bigDecimal = new BigDecimal(division);
        // -> bigDecimal.setScale() - RoundingMode.HALF_UP
        BigDecimal bigDecimalUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Division with BigDecimal Class - bigDecimal.setScale() - RoundingMode.HALF_UP - Rounding to 2 decimal places: " + bigDecimalUp);
        // -> bigDecimal.setScale - RoundingMode.HALF_DOWN
        BigDecimal bigDecimalDown = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Division with BigDecimal Class - bigDecimal.setScale - RoundingMode.HALF_DOWN - Rounding to 2 decimal places: " + bigDecimalDown);
    }
}