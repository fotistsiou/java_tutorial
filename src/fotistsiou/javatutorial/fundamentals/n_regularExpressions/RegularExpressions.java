package fotistsiou.javatutorial.fundamentals.n_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expressions
 * -> A regular expression is a sequence of characters that forms a search pattern.
 * -> A regular expression can be a single character, or a more complicated pattern.
 * -> Regular expressions can be used to perform all types of text search and text replace operations.
 * -> To work with regular expressions we can import the java.util.regex package. The package includes the classes:
 *    - "Pattern" Class - Defines a pattern (to be used in a search)
 *    - "Matcher" Class - Used to search for the pattern
 *    - "PatternSyntaxException" Class - Indicates syntax error in a regular expression pattern
 */

public class RegularExpressions {

    public static void main(String[] args) {
        // 1st Step - Pattern.compile() method
        // -> The "pattern" is created using the Pattern.compile() method.
        // -> The first parameter indicates which pattern is being searched for.
        // -> The second parameter has a flag to indicates that the search should be case-insensitive.
        //    - Flags change how the search is performed. Here are a few of them:
        //      -> "Pattern.CASE_INSENSITIVE": The case of letters will be ignored.
        //      -> "Pattern.LITERAL": Special characters in the pattern will not have any special meaning.
        //      -> "Pattern.UNICODE_CASE": The case of letters outside the English alphabet will be ignored.
        Pattern pattern = Pattern.compile("world", Pattern.CASE_INSENSITIVE);

        // 2nd Step - matcher() method
        // -> The matcher() method is used to search for the pattern in a string.
        // -> It returns a Matcher object which contains information about the search that was performed.
        Matcher matcher = pattern.matcher("Hello World!");

        // 3rd Step - find() method
        // -> The find() method returns true if the pattern was found in the string and false if it was not found.
        boolean matchFound = matcher.find();
        // -> Utilizing of the result of the find() method.
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
