package fotistsiou.javatutorial.fundamentals.m_files_apis;

/* File Handling */
// -> Java has several methods for creating, reading, updating, and deleting files.
// -> The File class from the java.io package, allows us to work with files.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesHandling {
    static String path = "./src/fotistsiou/javatutorial/fundamentals/m_files_apis/files/";

    public static void main(String[] args) throws IOException {
        // Create a File
        File createFile = new File(path + "create_a_file.txt");
        if (createFile.createNewFile()) {
            System.out.println("Successfully create a file: " + createFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Write To a File
        FileWriter writeFile = new FileWriter(path + "write_to_a_file.txt");
        writeFile.write("Files in Java might be tricky, but it is fun enough!");
        writeFile.close();
        System.out.println("Successfully create a file.");
    }
}
