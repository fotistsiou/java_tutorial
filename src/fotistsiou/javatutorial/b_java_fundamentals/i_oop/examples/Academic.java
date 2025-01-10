package fotistsiou.javatutorial.b_java_fundamentals.i_oop.examples;

// Abstract Class
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
