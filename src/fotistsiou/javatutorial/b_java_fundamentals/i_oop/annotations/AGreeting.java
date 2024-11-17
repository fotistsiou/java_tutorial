package fotistsiou.javatutorial.b_java_fundamentals.i_oop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotations
 * An annotation in Java is a form of metadata that can provide information about code but doesn't affect the execution.
 */

// Annotation Definition
@Target(ElementType.METHOD)  // Specifies that this annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME) // Specifies that this annotation is available at runtime
public @interface AGreeting {
    // Annotation Elements
    String value() default "Hello World"; // An element in the annotation with a default value
    int priority() default 0; // Another element with a default value
}
