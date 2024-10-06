package fotistsiou.javatutorial.fundamentals.b_syntax_conventions_comments;

/* Syntax */
// -> The curly braces {} marks the beginning and the end of a block of code.
// -> You should also note that each code statement must end with a semicolon.
// -> Every Java application has to have at least one class.
// -> The name of the java file must match the class name.
// -> Every line of code that runs in Java must be inside a class.
// -> The main() method is the heart of our program, where the execution begins.

/* Conventions */
// -> A list of recommendations on how to write code for some particular language is usually
//    called a coding style guide or style conventions.
// -> There are two generally accepted Java conventions that are used all over the world:
//    - Oracle Code Conventions.
//    - Google Style Guide.
// -> Some of the most basic Java conventions:
//    - The number of spaces.
//    - The location of curly braces.
//    - Avoid extra spaces.
//    - The length of a line.

/* Comments */
// -> Comments can be used:
//    - To explain Java code.
//    - To make it more readable.
//    - To prevent execution when testing alternative code.
//    - To automatically generate documentation about your source code by using the javadoc tool.
// -> There are 3 types of comments:
//    - Single-line Comments (start with two forward slashes //).
//    - Java Multi-line Comments (start with /* and ends with */).
//    - Java documentation comments (start with /** and ends with */)

public class SyntaxComments {

    /**
     * The main method accepts an array of string arguments
     *
     * @param args from the command line
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
