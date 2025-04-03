package fotistsiou.javatutorial.b_java_fundamentals_topics.m_exceptions_bugs.examples;

public class DebuggingMethods {
    public static void main(String[] args) {
        greetUser("Alice");
    }

    public static void greetUser(String name) {
        String greeting = "Hello, " + name;
        System.out.println(greeting);
    }
}
