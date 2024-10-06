/* Packages & APIs */
// -> A package in Java is used to group related classes.
// -> We use packages:
//    - To avoid name conflicts.
//    - To write a better maintainable code.
// -> Packages are divided into two categories:
//    - Built-in Packages (packages from the Java API)
//    - User-defined Packages (create your own packages)

/* IO Streams */
// -> Java brings various Streams with its I/O package that helps the user to perform all the input-output operations.
// -> Java has to provide 2 standard streams which are most common in use:
//    - The Standard Input Stream that is used to read characters from the keyboard or any other standard input device.
//    - The Standard Output Stream that is used to produce the result of a program on an output device like the computer screen.

// User-defined Package
package fotistsiou.javatutorial.fundamentals.b_syntax_comments_packages_ioStreams;

// Built-in Package
import java.util.Scanner; // Import a single class

public class PackagesIoStreams {

    public static void main(String[] args) {
        // Standard Output Stream
        System.out.print("Hello! My name is Fotis and I'm "); // Print without insert a new line
        System.out.print(2024 - 1995); // Print without insert a new line
        System.out.println(" years old."); // Print with insert a new line

        // Standard Input Stream
        // 1. Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // 2. Add question
        System.out.println("What is your name?");
        // 3. Read/Save user input
        String name = scanner.nextLine();
        // 4. Print user input
        System.out.println("Your name is " + name);
        // 5. Close the scanner
        scanner.close();
    }
}