package fotistsiou.javatutorial.b_java_fundamentals_topics.k_serialization;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Serialization and Deserialization
 * -> Serialization is the conversion of the state of an object into a byte stream.
 * -> Deserialization does the opposite.
 * -> The serialization process is instance-independent.
 *    For example, we can serialize objects on one platform and deserialize them on another.
 * -> Classes that are eligible for serialization need to implement a special marker interface, Serializable.
 */

public class Serialization {
    // Define the path to store the serializable object file.
    final static String path = "./src/fotistsiou/javatutorial/fundamentals/l_serialization/files/";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a serializable object.
        SerializableObject serializableObject1 = new SerializableObject(1, "Test Object");
        // Save it to a file using the serialize method.
        serialize(serializableObject1);
        // Create a serializable object using the deserialize method.
        SerializableObject serializableObject2 = deserialize(Serialization.path + "serializable_object.txt");
        // Print the serializable object
        System.out.println(serializableObject2.toString());
    }

    // Serialization Process
    static void serialize(SerializableObject serializableObject) throws IOException {
        // 1. Creates a stream (fileOutputStream) that writes bytes to a file.
        FileOutputStream fileOutputStream = new FileOutputStream(Serialization.path + "serializable_object.txt");
        // 2. Wraps around the stream (fileOutputStream) and provides functionality/methods
        //    to serialize a Java object (serializableObject) into bytes and write them to the file.
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // 3. Serializes the object (serializableObject) and writes it to the file.
        objectOutputStream.writeObject(serializableObject);
        // 4. Close streams (objectOutputStream, fileOutputStream) after writing the object to release resources and
        //    ensure data is flushed to the file.
        objectOutputStream.close();
        fileOutputStream.close();
        // 5. Prints a message to indicate successful serialization.
        System.out.println("Object has been serialized");
    }

    // Deserialization Process
    static SerializableObject deserialize(String filename) throws IOException, ClassNotFoundException {
        // 1. The stream (fileInputStream) reads raw bytes from the file specified by 'filename' argument.
        FileInputStream fileInputStream = new FileInputStream(filename);
        // 2. Wraps around the stream (fileInputStream) and provides functionality/methods
        //    to deserialize a object from the stream of bytes.
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // 3. Reads the serialized object data from the file and converts it back into an object (serializableObject).
        SerializableObject serializableObject = (SerializableObject) objectInputStream.readObject();
        // 4. Close streams (objectInputStream, fileInputStream) after writing the object to release resources.
        objectInputStream.close();
        fileInputStream.close();
        // 5. Prints a message to indicate successful deserialization.
        System.out.println("Object has been deserialized");
        // 6. Return the deserialized object.
        return serializableObject;
    }
}
