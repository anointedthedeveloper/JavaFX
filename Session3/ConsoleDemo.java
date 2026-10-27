// Extracted Java code snippet 23 from the supplied notes.
import java.io.Console;
import java.io.IOError;
public class ConsoleDemo {
public static void main(String [] args) {
Console cons = System.console();
if (cons == null) {
System.err.println("No console device is present!");
return;
}
try {
String username = cons.readLine("Enter your username: ");
char [] pwd = cons.readPassword("Enter your secret Password: ");
System.out.println("Username = " + username);
System.out.println("Password entered was = " + new String(pwd));
}
catch(IOError ioe) {
cons.printf("I/O problem: %s\n", ioe.getMessage());
}
}
}
