// Extracted from Code Snippet 4 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class FileConstructorDemo {
    public static void main(String[] args) throws Exception {
        File fileObj = new File("/tmp/myFile.txt");
        // OR (alternative constructor)
        File fileObj = new File("/tmp", "myFile.txt");
    }
}
