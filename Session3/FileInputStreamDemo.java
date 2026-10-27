// Extracted from Code Snippet 9 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fileName = new FileInputStream("Helloworld.txt");
        File fName = new File("/command.doc");
        FileInputStream fileObj = new FileInputStream(fName);
    }
}
