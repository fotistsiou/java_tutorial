package fotistsiou.javatutorial.fundamentals.g_oop;

public class Academic {
    // Use private access modifiers for the attributes
    private String name;
    private String type;

    // Constructor 1 - Allows to create object without assigning values to attributes
    public Academic() {}

    // Constructor 2 - Create an object by directly assigning values to attributes
    public Academic (
        String name,
        String type
    ){
        this.name = name;
        this.type= type;
    }

    // Public 'Getters & Setters' for the private 'Attributes'
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

    // Public 'Method'
    public void announce() {
        System.out.println("The " + type + " " + name + ".");
    }
}
