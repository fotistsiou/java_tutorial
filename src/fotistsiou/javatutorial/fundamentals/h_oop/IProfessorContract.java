package fotistsiou.javatutorial.fundamentals.h_oop;

/* Interfaces */
// -> An interface can extend multiple interfaces.
// -> An interface cannot extend a class.
// -> A class cannot extend multiple classes.
// -> A class cannot implement multiple interfaces.

public interface IProfessorContract extends IRaiseLowerHand, ISpeak {
    // "IProfContract" allows the classes that implement it to implement "ISpeak" and "IRaiseLowerHand" interfaces.
}
