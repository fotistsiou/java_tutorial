package fotistsiou.javatutorial.fundamentals.m_files_apis;

/* File Handling */
// -> Java has several methods for creating, reading, updating, and deleting files.
// -> The File class from the java.io package, allows us to work with files.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

        // Read a File
        File file = new File(path + "write_to_a_file.txt");
        Scanner readFile = new Scanner(file);
        if (file.exists()) {
            System.out.println("1. File name: " + file.getName());
            System.out.println("2. Absolute path: " + file.getAbsolutePath());
            System.out.println("3. Writeable: " + file.canWrite());
            System.out.println("4. Readable: " + file.canRead());
            System.out.println("5. File size in bytes: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
        System.out.println("6. Content of file: ");
        while (readFile.hasNextLine()) {
            String data = readFile.nextLine();
            System.out.println("- \"" + data + "\"");
        }
        readFile.close();
    }
}
