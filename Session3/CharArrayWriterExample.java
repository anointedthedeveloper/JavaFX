// Extracted from Code Snippet 18 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class CharArrayWriterExample {
    public static void main(String[] args) throws Exception {
        CharArrayWriter fObj = new CharArrayWriter();
        String temp = "Hello World";
        int size = temp.length();
        char [] ch = new char[size];
        
        
        temp.getChars(0, temp.length(), ch, 0);
        fObj.write(ch);
        char[] buffer = fObj.toCharArray();
        System.out.println(buffer);
        System.out.println(fObj.toString());
    }
}
