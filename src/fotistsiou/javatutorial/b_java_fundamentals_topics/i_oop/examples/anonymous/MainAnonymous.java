package fotistsiou.javatutorial.b_java_fundamentals_topics.i_oop.examples.anonymous;

import fotistsiou.javatutorial.b_java_fundamentals_topics.i_oop.examples.Academic;
import fotistsiou.javatutorial.b_java_fundamentals_topics.i_oop.examples.interfaces.ISpeak;
import fotistsiou.javatutorial.b_java_fundamentals_topics.i_oop.examples.Student;

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
