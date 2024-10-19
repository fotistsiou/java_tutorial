package fotistsiou.javatutorial.fundamentals.o_regularExpressions;

/* Regular Expressions Patterns */
// -> The first parameter of the Pattern.compile() method is the pattern.
// -> Brackets are used to find a range of characters:
//    - [abc]: Find one character from the options between the brackets
//    - [^abc]: Find one character NOT between the brackets
//    - [0-9]:	Find one character from the range 0 to 9

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsPatterns {

    public static void main(String[] args) {
        // Pattern Object
        Pattern pattern = Pattern.compile("[abc]");

        // Matcher Object
        Matcher matcher = pattern.matcher("apple, banana, cherry, kiwi");

        // Check for matches and print them
        System.out.println("Matching characters in the input string:");
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
