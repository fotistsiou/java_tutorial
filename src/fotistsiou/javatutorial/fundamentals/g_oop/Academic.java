package fotistsiou.javatutorial.fundamentals.g_oop;

public abstract class Academic {
    // Attributes
    // Used private access modifiers for
    private String name;
    private String type;

    // Constructor 1
    // Default constructor that allows object creation without assigning values to attributes
    public Academic() {}

    // Constructor 2
    // Create an object by directly assigning values to attributes
    public Academic (
        String name,
        String type
    ){
        this.name = name;
        this.type= type;
    }

    // Getters & Setters
    // Used for access to private attributes
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    // Academic Abstract Method
    public abstract void announce();
}
