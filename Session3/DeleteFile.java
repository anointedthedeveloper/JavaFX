package Session3;
import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        //Create File object
        File fileObj = new File("C:\\Users\\DELL\\Desktop\\JavaFX\\testdelete.txt");
        //Delete the file
        if (fileObj.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
