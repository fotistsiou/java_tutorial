package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methodsBuiltIn;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Built-In Methods - Time Package
 * -------------------------------
 * Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
 * The package includes many date and time classes.
 */




public class BuiltInMethodsTimePackage {

    public static void main(String[] args) {
        // Record the start time using System.nanoTime()
        long startTime = System.nanoTime();

        // Get the current time using LocalTime class
        LocalTime time = LocalTime.now();

        // Get the current date and time using LocalDateTime class
        LocalDateTime dateTime= LocalDateTime.now();

        // Format the date and time using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(dateTimeFormatter);

        // Print the current time, date-time, formatted date-time
        System.out.println("Display Current Time: " + time);
        System.out.println("Display Current Date and Time: " + dateTime);
        System.out.println("Formatting Date and Time: " + formattedDateTime);

        // Record the end time using System.nanoTime()
        long endTime = System.nanoTime();

        // Calculate and display the duration of the process in seconds
        System.out.println("Duration of Process: " + (endTime - startTime)/1000000000.0 + " seconds");
    }
}
