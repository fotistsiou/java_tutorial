package fotistsiou.javatutorial.b_java_fundamentals.i_oop.examples.annotations;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Use the custom annotation
        class Greeding {
            // -> Default Values
            @AGreeting
            public void greet() {
                System.out.println("This method is annotated with AGreeting annotation with default values.");
            }
            // -> Customized Values
            @AGreeting(value = "Hello Everyone", priority = 1)
            public void greetAgain() {
                System.out.println("This method is annotated with AGreeting annotation with customized values.");
            }

        }

        // You can access the annotations applied to methods using reflection.
        // -> Create a Greeting object
        Greeding greeding = new Greeding();
        // -> Get all methods of the Greeting class
        Method[] methods = greeding.getClass().getDeclaredMethods();
        // -> Iterate through all methods to check if they are annotated with AGreeting
        int index = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(AGreeting.class)) {
                AGreeting annotation = method.getAnnotation(AGreeting.class);
                System.out.println("AGreeting Annotated Method " + index + ":");
                System.out.println("Method -> " + method.getName());
                System.out.println("Value -> " + annotation.value());
                System.out.println("Priority -> " + annotation.priority());
            }
            index++;
        }
    }
}
