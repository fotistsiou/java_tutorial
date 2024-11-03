package fotistsiou.javatutorial.fundamentals.j_oop.interfaces;

/**
 * Interfaces & Methods
 * -> Interfaces
 *    - An interface looks like an abstract class with the difference that an interface has only abstract methods and fields.
 *    - An interface cannot contain a constructor (as it cannot be used to create objects)
 * -> Methods
 *    - Interface methods do not have a body - the body is provided by the "implement" class.
 *    - Interface methods are by default abstract and public.
 */

public interface IRaiseLowerHand {
    void raiseHand(String raise);
    void lowerHand(String lower);
}
