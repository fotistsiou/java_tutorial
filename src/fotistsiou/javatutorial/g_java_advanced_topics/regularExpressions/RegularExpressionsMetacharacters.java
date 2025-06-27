package fotistsiou.javatutorial.g_java_advanced_topics.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expressions Metacharacters
 * -> Metacharacters are characters with a special meaning:
 *    - "|": Find a match for any one of the patterns separated by | as in: cat|dog|fish
 *    - ".": Find just one instance of any character
 *    - "^": Finds a match as the beginning of a string as in: ^Hello
 *    - "$": Finds a match at the end of the string as in: World$
 *    - "\d": Find a digit
 *    - "\s": Find a whitespace character
 *    - "\b": Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
 *    - "\\uxxxx": Find the Unicode character specified by the hexadecimal number xxxx
 */

public class RegularExpressionsMetacharacters {

    public static void main(String[] args) {
        // Create a Pattern object
        Pattern compiledPattern = Pattern.compile("\\d");

        // Create a Matcher object
        Matcher matcher = compiledPattern.matcher("Order number: 12345, Amount: $678, Code: 90");

        // Check for matches and print them
        System.out.println("Matching digits in the input string:");
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
