// Extracted Java code snippet 10 from the supplied notes.
import java.io.FileInputStream;
import java.io.IOException;
public class FIStream {
public static void main(String argv[]){
try {
FileInputStream intest;
intest = new FileInputStream("D:/resources/Client.java");
int ch;
while ((ch = intest.read()) > -1) {
StringBuffer buf = new StringBuffer();
buf.append((char) ch);
System.out.print(buf.toString());
}
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
}
