package fotistsiou.javatutorial.fundamentals.l_serialization;

/* Serializable Object */
// -> A serializable object must implements Serializable interface
// -> You can override the toString method to use it to print a deserialized object.

import java.io.Serializable;

public class SerializableObject implements Serializable {
    private int id;
    private String name;

    public SerializableObject(
        int id,
        String name
    ){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id => " + this.getId() + ", name => " + this.getName() + "]";
    }
}
