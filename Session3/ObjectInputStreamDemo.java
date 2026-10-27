// Extracted from Code Snippet 21 in the supplied notes.
// The source notes provide only a fragment for this example.
import java.io.*;
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fObj = new FileInputStream("customer.dat");
        ObjectInputStream ois = new ObjectInputStream(fObj);
        Person obj = (Person) ois.readObject();
        System.out.println(obj.name);
        ois.close();
    }
}
