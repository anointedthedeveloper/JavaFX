package Session3;
import java.io.*;
public class FileTest {
    public static void main(String[] args) {
        //Create File object
        File fileObj = new File("C:/Users/DELL/Desktop/JavaFX/Session2/CollectionManager.java");
        //Access File properties
        System.out.println("Path is: " + fileObj.getPath());
        System.out.println("Name is: " + fileObj.getName());
        System.out.println("File exists is: " + fileObj.exists());
        System.out.println("File is: " + fileObj.isFile());
    }
}