package fotistsiou.javatutorial.fundamentals.g_oop;

/* Classes */
// -> There are "blueprints" for creating instances/objects.

// Abstract Class
// -> Is a restricted class that cannot be used to create objects.
// -> To access it, it must be inherited from another class.
public abstract class Academic {
    /* Attributes */
    // They are instances/objects fields of classes

    // "private" access modifier
    // -> Defines attributes that are only accessible within the declared class.
    private String name;
    // "static final" non-access modifier
    // -> "static" defines attributes that belongs to the class.
    // -> "final" defines attributes that cannot be overridden/modified.
    static final String university = "University of Piraeus";


    /* Constructors */
    // -> They are methods used to initialize instances/objects of classes.

    // Constructor 1
    // -> It is the default constructor in case there is no constructor in the class.
    // -> Allows instance/object creation without assigning values to attributes.
    public Academic() {}
    // Constructor 2
    // -> Allows instance/object creation by directly assigning values to attributes
    public Academic (String name){
        this.name = name;
    }


    /* Getters & Setters */
    // -> They are methods that provide access to "private" attributes.

    // Getter
    // -> Return the value of the "private" attribute.
    public String getName() {
        return name;
    }
    // Setter
    // -> Assign a value in the "private" attribute.
    public void setName(String name) {
        this.name = name;
    }


    /* Methods */
    // -> They are used to perform certain actions.

    // Abstract Method
    // -> Can only be used in an abstract class.
    // -> It does not have a body.
    // -> The body is provided by the subclass (inherited from).
    public abstract void announce();
}
