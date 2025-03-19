package fotistsiou.javatutorial.b_java_fundamentals_topics.i_oop.examples.interfaces;

// Interfaces Inheritance
public interface IProfessorContract extends IRaiseLowerHand, ISpeak {
    // "IProfContract" allows the classes that implement it to implement "ISpeak" and "IRaiseLowerHand" interfaces.
}
