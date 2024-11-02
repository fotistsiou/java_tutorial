package fotistsiou.javatutorial.fundamentals.j_oop;

/* Access Modifiers */
// -> Controls the access level
// -> There are 4 types of Access Modifiers:
//    - private
//      -> The code is only accessible within the declared class.
//      -> Code = attribute, constructor, method.
//    - default
//      -> The code is only accessible in the same package.
//      -> Code = class, attribute, constructor, method.
//      -> This is used when you don't specify a modifier.
//    - protected
//      -> The code is accessible in the same package and subclasses.
//      -> Code = attribute, constructor, method.
//    - public
//      -> The code is accessible for all classes.
//      -> Code = class, attribute, constructor, method.

/* Non-Access Modifiers */
// -> Do not control access level, but provides other functionality.
// -> There are 6 types of Non-Access Modifiers:
//    - For classes, you can use either final or abstract:
//      -> final: The class cannot be inherited by other classes.
//      -> abstract:
//         - The class cannot be used to create objects.
//         - It must be inherited from another class.
//    - For attributes and methods, you can use the one of the following:
//      -> final: Attributes and methods cannot be overridden/modified.
//      -> static: Attributes and methods belongs to the class, rather than an object.
//      -> abstract:
//         - Can only be used in an abstract class, and can only be used on methods.
//         - The method does not have a body.
//         - The body is provided by the subclass (inherited from).
//      -> transient: Attributes and methods are skipped when serializing the object containing them.
//      -> synchronized: Methods can only be accessed by one thread at a time.
//      -> volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory".

/* Class Attributes */
// -> A class attribute is an instances/objects field of class.
// -> You can access attributes by creating an object of the class, and by using the dot syntax (.)

/* Class Constructors */
// -> A Constructor is a method used to initialize instances/objects of a class.
// -> When no constructor exists, instances/objects of the class are created by the "default" constructor

/* Getters & Setters */
// -> They are methods that provide access to "private" attributes.

/* Class Methods */
// -> They are used to perform certain actions.

// Abstract Class
// -> An Abstract Class is a restricted class, that cannot be used to create objects.
// -> To access it, it must be inherited from another class.
// -> We use Abstract Classes and Methods
//    - To achieve security - hide certain details.
//    - To only show the important details of an object.
// -> Abstraction can also be achieved with Interfaces.
public abstract class Academic {
    // Class Attributes
    // "private" access modifier
    private String name;
    // "protected" access modifier & "static final" non-access modifiers
    protected static final String university = "University of Piraeus";

    // Class Constructor 1
    // -> It is the default constructor in case there is no constructor in the class.
    // -> Allows instance/object creation without assigning values to attributes.
    public Academic() {}
    // Class Constructor 2
    // -> Allows instance/object creation by directly assigning values to attributes
    public Academic (String name){
        this.name = name;
    }

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

    // Abstract Method
    // -> Can only be used in an abstract class.
    // -> It does not have a body.
    // -> The body is provided by the subclass (inherited from).
    public abstract void announce();
}
