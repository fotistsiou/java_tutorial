package fotistsiou.javatutorial.b_java_fundamentals.c_variables_dataTypes_typeCasting.data_types;

/**
 * The Java Text Block
 * -------------------
 * -> Java text blocks simplify multiline Strings by using a group of three quotes at the beginning and end:
 *    - Almost every character in between does not need to be escaped.
 *    - No explicit newlines are required.
 *    - No concatenation operators are needed.
 * -> Indentation & Whitespace:
 *    - The Java compiler makes a distinction between incidental whitespace and essential whitespace.
 *    - You can 'stripIndent' method to strips the whitespace indentation.
 *    - You can 'translateEscapes' method to make escaped characters appear properly.
 * -> Character Suppressors:
 *    - You can add '\' as a new line character suppressor at the end of each line.
 *    - You can also use '\s' at the end of a line
 *      - to add a space that won't be stripped
 *      - to prevent the compiler from removing trailing spaces occurring before this
 * -> Text blocks do not directly support String interpolation, but since a text block is still a String type, you can use:
 *    - The 'format' method
 *    - The 'replace' method
 *    - The 'formatted' method
 */

public class ReferenceDataTypeString {

    public static void main(String[] args) {
        // Without Java Text Block
        String example = "\"But raging still, amidst his navy sat\n" +
                "The stern Achilles, stedfast in his hate;\n" +
                "Nor mix’d in combat, nor in council join’d;\n" +
                "But wasting cares lay heavy on his mind:\n" +
                "In his black thoughts revenge and slaughter roll,\n" +
                "And scenes of blood rise dreadful in his soul.\"";
        System.out.println(example);

        // With Java Text Block
        String example1 = """ 
                "But raging still, amidst his navy sat
                The stern Achilles, stedfast in his hate;
                Nor mix’d in combat, nor in council join’d;
                But wasting cares lay heavy on his mind:
                In his black thoughts revenge and slaughter roll,
                And scenes of blood rise dreadful in his soul."
                """;
        System.out.println(example1);

        // Indentation & Whitespace: 'stripIndent' method
        String example2 = """
                \t    Hello, World!
                \t    This is a text block example.
                \t    Indentation will be stripped.
                """;
        String stripped = example2.stripIndent();
        System.out.println("Before stripIndent:\n" + example2);
        System.out.println("After stripIndent:\n" + stripped);

        // Indentation & Whitespace: 'stripIndent' method
        // TODO: Fix example
        String example3 = """
                Hello, World!\\nThis is a new line.\\tAnd a tab.
                Escaped backslash: \\\\.
                """;
        String translated = example3.translateEscapes();
        System.out.println("Before translateEscapes:\n" + example3);
        System.out.println("After translateEscapes:\n" + translated);

        // Character Suppressors: '\' & '\s'
        String example4 = """ 
                The line after me will be directly concatenated onto the same line\
                But this line will preserve a single trailing space at the end\s
                And this line will keep six trailing spaces     \s 
                """;
        System.out.println(example4);

        // String Interpolation: 'format' method
        String name1 = "Fotis";
        int age1 = 29;
        String example5 = String.format("""
                Hello, %s!
                You are %d years old.
                """, name1, age1);
        System.out.println(example5);

        // String Interpolation: 'replace' method
        String name2 = "Aspa";
        int age2 = 29;
        String template = """
                Hello, {name}!
                You are {age} years old.
                """;
        String example6 = template
            .replace("{name}", name2)
            .replace("{age}", String.valueOf(age2));
        System.out.println(example6);

        // String Interpolation: 'formatted' method
        String name3 = "Rafahlia";
        int age3 = 15;
        String example7 = """
                Hello, %s!
                You are %d years old.
                """.formatted(name3, age3);
        System.out.println(example7);
    }
}
