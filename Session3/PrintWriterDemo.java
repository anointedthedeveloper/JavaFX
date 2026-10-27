// Extracted Java code snippet 16 from the supplied notes.
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class PrintWriterDemo {
public static void main(String[] args) throws Exception {
InputStreamReader reader = new InputStreamReader (System.in);
OutputStreamWriter writer = new OutputStreamWriter (System.out);
PrintWriter pwObj = new PrintWriter (writer,true);
int tmp = 0;
char ch;
try {
while (tmp != -1) {
tmp = reader.read ();
ch = (char) tmp;
pwObj.println ("echo " + ch);
}
}
catch (IOException e){
System.out.println ("IO error:" + e );
}
}
}

An instance of the PrintWriter class is created. The println() method is used to display the
value accepted from the user.

3.11.4 CharArrayReader Class

CharArrayReader class is a subclass of Reader class. The class uses a character array as the
source of text to be read. CharArrayReader class has two constructors and reads stream of
characters from an array of characters.
