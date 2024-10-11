package fotistsiou.javatutorial.fundamentals.m_files_apis;

/* File Handling */
// -> Java has several methods for creating, reading, updating, and deleting files.
// -> The File class from the java.io package, allows us to work with files.
// -> To create a file in Java, you can use the java.io.File class.
// -> To write to a File in Java, we use the java.io.FileWriter class.
// -> There are many available classes in the Java API that can be used to read and write files in Java:
//    FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
// -> To delete a file in Java, you can use the java.io.File class.


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
        File readFile = new File(FilesHandling.path + "write_to_a_file.txt");
        Scanner reader = new Scanner(readFile);
        if (readFile.exists()) {
            System.out.println("1. File name: " + readFile.getName());
            System.out.println("2. Absolute path: " + readFile.getAbsolutePath());
            System.out.println("3. Writeable: " + readFile.canWrite());
            System.out.println("4. Readable: " + readFile.canRead());
            System.out.println("5. File size in bytes: " + readFile.length());
        } else {
            System.out.println("The file does not exist.");
        }
        System.out.println("6. Content of file: ");
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println("- \"" + data + "\"");
        }
        reader.close();

        // Delete a File and a Folder
        // 1. Create a Folder
        File directoryForDelete = new File(FilesHandling.path + "delete_folder");
        if (directoryForDelete.mkdirs()) {
            System.out.println("Created the folder: " + directoryForDelete.getPath());
        }
        // 2. Create a File in the Folder
        File createFileForDelete = new File(FilesHandling.path + "delete_folder/delete_file.txt");
        if (createFileForDelete.createNewFile()) {
            System.out.println("Created the file: " + createFileForDelete.getName());
        }
        // 3. Delete the File
        File deleteFile = new File(FilesHandling.path + "delete_folder/delete_file.txt");
        if (deleteFile.delete()) {
            System.out.println("Deleted the file: " + deleteFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        // 4. Delete the Folder
        File deleteFolder = new File(FilesHandling.path + "delete_folder");
        if (deleteFolder.delete()) {
            System.out.println("Deleted the folder: " + deleteFolder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
