package fotistsiou.javatutorial.fundamentals.g_oop;

public class MainAnonymous {
    static void doSomethingWithStudent(Student student) {
        System.out.println(student);
        student.announce();
    }

    public static void main(String[] args) {
        /* Anonymous Classes */
        // -> Are inner classes with no name.
        // -> Since they have no name, we can’t use them in order to create instances of anonymous classes.
        // -> We have to declare and instantiate anonymous classes in a single expression at the point of use.
        // -> In order to create an anonymous class we may:
        // -> 1. Extend an existing class.
        // -> 2. Implement an interface.

        doSomethingWithStudent(
                // 1. Extend an existing class.
                // -> When we instantiate an anonymous class from an existent one, we use the following syntax.
                // -> In the parentheses, we specify the parameters that are required by the constructor of the class that we are extending.
                new Student(
                    "Dimitris Tsioumas",
                    "Stud0003"
                )
        );

        // 2. Implement an interface.
        // -> When we instantiate an anonymous class from an interface, we use the following syntax.
        // -> Java’s interfaces have no constructors, so the parentheses always remain empty.
        new ISpeak() {
            @Override
            public void speak(String speak) {
                System.out.println("I am an anonymous class and " + speak);
            }
        }.speak("I can speak!");
    }
}
