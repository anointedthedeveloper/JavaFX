// Extracted Java code snippet 08 from the supplied notes.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharStreamApp {
public static void main(String[] args) throws IOException {
FileReader inObjStream = null;
FileWriter outObjStream = null;
try {
inObjStream = new FileReader("c:/java/hello.txt");
outObjStream = new FileWriter("charoutputagain.txt");
int ch;
while ((ch = inObjStream.read()) != -1) {
outObjStream.write(ch);
}
outObjStream.close();
} finally {
if (inObjStream != null) {
inObjStream.close();
}
}
}
}
Character streams act as wrappers for byte streams. The character stream manages translation
between characters and bytes and uses the byte stream to perform the physical I/O operations. For
example, FileWriter uses FileOutputStream class to write the data.
When there are no required prepackaged character stream classes, byte-to-character bridge
streams, InputStreamReader and OutputStreamWriter, are used to create character
streams.
