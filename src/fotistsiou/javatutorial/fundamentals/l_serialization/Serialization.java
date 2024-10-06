package fotistsiou.javatutorial.fundamentals.l_serialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Use serialize() method.
        SerializableObject serializableObject1 = new SerializableObject(1, "Test Object");
        serialize(serializableObject1);

        // Use deserialize() method.
        SerializableObject serializableObject2 = deserialize("serializableObject.txt");
        System.out.println(serializableObject2);
    }

    static void serialize(SerializableObject serializableObject) throws IOException {
        // Saving of object in a file.
        FileOutputStream fileOutputStream = new FileOutputStream("./src/fotistsiou/javatutorial/fundamentals/l_serialization/serializableObject.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // Method for serialization of object.
        objectOutputStream.writeObject(serializableObject);
        // Close fileOutputStream and objectOutputStream objects.
        objectOutputStream.close();
        fileOutputStream.close();
        // Print success message.
        System.out.println("Object has been serialized");
    }

    static SerializableObject deserialize(String filename) throws IOException, ClassNotFoundException {
        // Reading the object from a file.
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // Method for deserialization of object
        SerializableObject serializableObject = (SerializableObject) objectInputStream.readObject();
        // Close file and in objects.
        objectInputStream.close();
        fileInputStream.close();
        // Print success message and return object.
        System.out.println("Object has been deserialized");
        return serializableObject;
    }
}
