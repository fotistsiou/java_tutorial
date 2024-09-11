/* Packages & APIs */

// User-defined Package (create your own package)
package fotistsiou.javatutorial.fundamentals.a_syntax_packages_ioStreams_comments;

// Built-in Package (package from the Java API)
import java.util.Scanner; // Import a single class


public class SyntaxPackagesIoStreamsComments {
    public static void main(String[] args) {
        /* IO Streams */

        // Output
        System.out.print("Hello! My name is Fotis and I'm ");
        System.out.print(2024 - 1995);
        System.out.println(" years old.");

        // Input
        // 1. Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // 2. Add question
        System.out.println("What is your name?");
        // 3. Read/Save user input
        String name = scanner.nextLine(); // read/save String
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // read/save int
        // 4. Print user input
        System.out.println("Your name is " + name + " and you're " + age + " years old.");
        // 5. Close the scanner
        scanner.close();
    }
}