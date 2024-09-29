package fotistsiou.javatutorial.fundamentals.f_methods.builtInMethods;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BuiltInMethodsTimePackage {

    public static void main(String[] args) {
        /* Built-In Methods - Time Package */
        // -> Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
        // -> The package includes many date and time classes.

        // System.nanoTime() - Start Time
        long startTime = System.nanoTime();

        // LocalTime class
        LocalTime time = LocalTime.now();
        // LocalDateTime class
        LocalDateTime dateTime= LocalDateTime.now();
        // DateTimeFormatter class
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(dateTimeFormatter);

        System.out.println("Display Current Time: " + time);
        System.out.println("Display Current Date and Time: " + dateTime);
        System.out.println("Formatting Date and Time: " + formattedDateTime);

        // System.nanoTime() - End Time
        long endTime = System.nanoTime();
        // System.nanoTime() - Duration to Seconds
        System.out.println("Duration of Process: " + (endTime - startTime)/1000000000.0 + " seconds");
    }
}
