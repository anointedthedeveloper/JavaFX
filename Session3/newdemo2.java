// Extracted Java code snippet 12 from the supplied notes.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class newdemo2 {
public static void main(String argv[]) throws FileNotFoundException,
IOException {
String temp = "One way to get the most out of life is to look upon it as an
adventure.";
byte [] bufObj = temp.getBytes();
FileOutputStream fileObj = new FileOutputStream("Thought.txt");
fileObj.write(bufObj);
fileObj.close();
}
}
Code Snippet 12 first stores the content of the String variable in the byte array, bufObj, using
the getBytes() method. Then, the entire content of the byte array is written to the file,
Thought.txt. The exceptions must either be caught or else declared in the main method as
shown here.
3.8.3 ByteArrayOutputStream Class
ByteArrayOutputStream class creates an output stream in which the data is written using a
byte array. It allows the output array to grow in size so as to accommodate the new data that is
written.
3.8.4 Methods in ByteArrayOutputStream Class
The ByteArrayOutputStream class inherits all the methods of the OutputStream class. The
methods of this class allow retrieving or converting data. Methods of this class can be invoked even
after the output stream has been closed and will not generate IOException.
