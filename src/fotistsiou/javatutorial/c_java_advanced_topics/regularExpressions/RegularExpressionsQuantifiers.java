package fotistsiou.javatutorial.c_java_advanced_topics.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expressions Quantifiers
 * -> Quantifiers define quantities:
 *    - "n+": Matches any string that contains at least one n
 *    - "n*": Matches any string that contains zero or more occurrences of n
 *    - "n?": Matches any string that contains zero or one occurrences of n
 *    - "n{x}": Matches any string that contains a sequence of X n's
 *    - "n{x,y}": Matches any string that contains a sequence of X to Y n's
 *    - "n{x,}": Matches any string that contains a sequence of at least X n's
 */

public class RegularExpressionsQuantifiers {

    public static void main(String[] args) {
        // Pattern Object
        Pattern pattern = Pattern.compile("\\d{2,4}");

        // Matcher Object
        Matcher matcher = pattern.matcher("Order: 1, ID: 234567, Code: 89, Ref: 123");

        // Check for matches and print them
        System.out.println("Matching 2 to 4 digits in the input string:");
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
