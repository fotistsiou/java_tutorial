package fotistsiou.javatutorial.fundamentals.g_oop;

public abstract class Academic {
    // Attributes
    private String name; // private access modifier is only accessible within the declared class
    static final String university = "University of Piraeus"; // static final variable cannot be overridden/modified and belongs to the class

    // Constructor 1
    // Default constructor that allows object creation without assigning values to attributes
    public Academic() {}

    // Constructor 2
    // Create an object by directly assigning values to attributes
    public Academic (String name){
        this.name = name;
    }

    // Getters & Setters
    // They are methods to provide access to private attributes
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Academic Abstract Method
    // It has to be implemented from your subclasses
    public abstract void announce();
}
