package fotistsiou.javatutorial.b_java_fundamentals_topics.h_methods.methods_built_in.stringBuilder_class;

/**
 * Strings in Java are immutable which means that once created, a string cannot be changed. If we want to modify the
 * content of a string object, we should create a new string. This may not be the best way when we perform a lot of
 * modifications because each operation creates a new object, which is bad for performance.
 * Fortunately, there is a special class named `StringBuilder` that is used to create mutable string objects.
 * An object of this class is similar to a regular string, except that it can be modified. As an example, it is better
 * to use `StringBuilder` than String where lots of concatenations are performed at runtime.
 */

public class StringBuilderClass {
    public static void main(String[] args) {
        // Constructing & Print StringBuilder Object
        StringBuilder sb1 = new StringBuilder("Hello!");
        System.out.println(sb1);

        // int length() -> returns the length (the character count)
        StringBuilder sb2 = new StringBuilder("I use Java");
        System.out.println(sb2.length());

        // char charAt(int index) -> returns a character located at the specified index
        StringBuilder sb3 = new StringBuilder("I use Java");
        System.out.println(sb3.charAt(0));
        System.out.println(sb3.charAt(6));

        // void setCharAt(int index, char ch) -> sets a character located at the specified index to ch
        StringBuilder sb4 = new StringBuilder("start");
        sb4.setCharAt(1, 'm');
        System.out.println(sb4);

        // StringBuilder deleteCharAt(int index) removes the character at the specified position
        StringBuilder sb5 = new StringBuilder("dessert");
        sb5.deleteCharAt(2);
        System.out.println(sb5);

        // StringBuilder append(String str) -> concatenates the given string to the end of the invoking object
        StringBuilder sb6 = new StringBuilder("abc");
        sb6.append("123");
        System.out.println(sb6);

        // StringBuilder insert(int offset, String str) -> inserts the given string into the existing object at the
        // given position indicated by the offset
        StringBuilder sb7 = new StringBuilder("I'm a programmer.");
        sb7.insert(6, "Java ");
        System.out.println(sb7);

        // StringBuilder replace(int start, int end, String str) -> replaces the substring from the specified string
        // index (inclusive) to the end index (exclusive) with a given string
        StringBuilder sb8 = new StringBuilder("Let's use C#");
        sb8.replace(10, 12, "Java");
        System.out.println(sb8);

        // StringBuilder delete(int start, int end) -> removes the substring from the start index (inclusive) to the
        // end index (exclusive)
        StringBuilder sb9 = new StringBuilder("Welcome");
        sb9.delete(0, 3);
        System.out.println(sb9);

        // StringBuilder reverse() -> causes this character sequence to be replaced by the reverse of the sequence
        StringBuilder sb10 = new StringBuilder("2 * 3 + 8 * 4");
        sb10.reverse();
        System.out.println(sb10);
    }
}
