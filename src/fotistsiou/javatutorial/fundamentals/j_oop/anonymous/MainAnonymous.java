package fotistsiou.javatutorial.fundamentals.j_oop.anonymous;

import fotistsiou.javatutorial.fundamentals.j_oop.Academic;
import fotistsiou.javatutorial.fundamentals.j_oop.interfaces.ISpeak;
import fotistsiou.javatutorial.fundamentals.j_oop.Student;

/**
 * Anonymous Class
 * -> It is an inner classes with no name.
 * -> Since it has no name, we cannot directly create new instances of them later.
 * -> We have to declare and instantiate anonymous classes in a single expression at the point of use.
 * -> In order to create an anonymous class we have to:
 * -> 1. Extend an existing class.
 * ->    - When we instantiate an anonymous class from an existent one, we use the syntax "new Class(...){...}".
 * ->    - In the parentheses, we specify the parameters that are required by the constructor of the class
 *         that we are extending.
 * ->    - Anonymous classes cannot have any static members except for those that are constant.
 * -> 2. Implement an interface.
 * ->    - When we instantiate an anonymous class from an interface, we use the syntax "new Interface(){...}".
 * ->    - Java’s interfaces have no constructors, so the parentheses always remain empty.
 * --------------------------------------------------------------------------------------------------------------
 * Anonymous Object
 * -> It is an instance of a class that is created without assigning it to a named reference variable.
 * -> This object can be an instance of either a named class or an anonymous class.
 */

public class MainAnonymous {

    public static void main(String[] args) {
        // 1. Extend an existing class.
        // -> We define an anonymous class that extends the "Student" class.
        // -> This anonymous class has no name and is created inline where you need it.
        // -> The "static final String type" is a constant (final and assigned at compile time).
        // -> Inside the anonymous class, we override the "announce()" method.
        // -> The anonymous class instantiates an object.
        // -> The object that is created does not have a reference or variable name, hence it is an anonymous object.
        // -> The anonymous object, that is created, immediately calls the overridden "announce()" method using ".announce()".
        new Student(
            "Dimitris Tsioumas",
            "Stud0003"
        ){
            static final String type = "anonymous student";

            @Override
            public void announce() {
                System.out.println("I am an " + this.type + " with name " + this.getName() + " of the " + Academic.university + ".");
            }
        }.announce();

        // 2.1. Implement an interface.
        // -> We define an anonymous class that implements the "ISpeak" interface.
        // -> In the curly braces, the anonymous class implements the speak method of the "ISpeak" interface.
        // -> The anonymous class instantiates an anonymous object.
        // -> The anonymous object immediately calls the implemented "speak()" method using ".speak("...")".
        new ISpeak() {
            @Override
            public void speak(String speak) {
                System.out.println("I am an anonymous object and " + speak);
            }
        }.speak("I can Speak!");

        // 2.2. Implement an interface.
        // -> We define an anonymous class that implements the "ISpeak" interface.
        // -> In the curly braces, the anonymous class implements the speak method of the "ISpeak" interface.
        // -> The anonymous class instantiates an anonymous object that assigned to the "anonymousISpeak" variable.
        // -> The "speak("...")" method of the anonymous object is then called.
        ISpeak anonymousISpeak = new ISpeak() {
            @Override
            public void speak(String speak) {
                System.out.println("I am an anonymous object inside a variable and " + speak);
            }
        };
        anonymousISpeak.speak("I can Speak!");
    }
}
