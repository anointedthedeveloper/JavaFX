// Extracted from Code Snippet 17 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class CharArrayReaderDemo {
    public static void main(String[] args) throws Exception {
        String temp = "Hello World";
        int size = temp.length();
        char [] ch = new char[size];
        temp.getChars(0, size, ch, 0);
        CharArrayReader readObj = new CharArrayReader(ch, 0, 5);
    }
}
