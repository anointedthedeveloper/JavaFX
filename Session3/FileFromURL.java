package Session3;
import java.io.*;
public class FileFromURL {
    public static void main(String[] args) {
        //create a new file with a file directory path
        File newFile = new File("https://visme.co/blog/wp-content/uploads/2022/05/combination-mark-logo-examples.jpg");

        //access file properties
        System.out.println("Path is: " + newFile.getPath());
        System.out.println("Name is: " + newFile.getName());
        System.out.println("File exists is: " + newFile.exists());
        System.out.println("File is: " + newFile.isFile());
    }
}
