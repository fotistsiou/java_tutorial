package fotistsiou.javatutorial.fundamentals.m_files_apis;

/* File Handling */
// -> Java has several methods for creating, reading, updating, and deleting files.
// -> The File class from the java.io package, allows us to work with files.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesHandling {
    // Define the path to store your files.
    final static String path = "./src/fotistsiou/javatutorial/fundamentals/m_files_apis/files/";

    public static void main(String[] args) throws IOException {
        // Create a File
        File createFile = new File(FilesHandling.path + "create_a_file.txt");
        if (createFile.createNewFile()) {
            System.out.println("Successfully create a file: " + createFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Write To a File
        FileWriter writeFile = new FileWriter(FilesHandling.path + "write_to_a_file.txt");
        writeFile.write("First Write To a File!\n");
        writeFile.close();
        System.out.println("Successfully create a file.");
    }
}
