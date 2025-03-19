package fotistsiou.javatutorial.b_java_fundamentals_topics.a_syntax_conventions_comments.problems;

import java.util.Scanner;

/**
 * Give the type of element
 * ------------------------
 * Given the following code:
 * public class Main {
 *     public static void main(String[] args) {
 *         System.out.println("Hello World");
 *     }
 * }
 * ------------------------
 * Determine the type of each of the following elements in the code above:
 * 1. Main
 * 2. class
 * 3. main
 * 4. println
 */

public class GiveTheType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the type of the 1st element (Main):");
            String element1 = scanner.nextLine();
            System.out.println("Enter the type of the 2nd element (class):");
            String element2 = scanner.nextLine();
            System.out.println("Enter the type of the 3rd element (main):");
            String element3 = scanner.nextLine();
            System.out.println("Enter the type of the 4th element (println):");
            String element4 = scanner.nextLine();

            int score = 0;

            if (element1.equals("class")) {
                score++;
            } else {
                System.out.println("Main: What kind of entity is this in Java?");
            }
            if (element2.equals("keyword")) {
                score++;
            } else {
                System.out.println("class: What is this in the context of Java syntax?");
            }
            if (element3.equals("method")) {
                score++;
            } else {
                System.out.println("main: What role does this play in the program?");
            }
            if (element4.equals("method")) {
                score++;
            } else {
                System.out.println("println: What kind of functionality does this represent?");
            }

            System.out.println("Your score is: " + score + "/4.");

            if (score == 4) {
                System.out.println("Congratulations!");
                scanner.close();
                return;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
