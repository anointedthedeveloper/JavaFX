// Extracted from Code Snippet 13 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        String strObj = "Hello World";
        byte[] buf = strObj.getBytes();
        ByteArrayOutputStream byObj = new ByteArrayOutputStream();
        byObj.write(buf);
        System.out.println("The string is: " + byObj.toString());
    }
}
