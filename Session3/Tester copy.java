// Extracted Java code snippet 02 from the supplied notes.
import java.util.stream.Stream;
public class Tester {
public static void main(String[] args) {
Stream.of("g","h","i","","k","l").dropWhile(s-> !s.isEmpty())
.forEach(System.out::print);
System.out.println();
Stream.of("g","h","i","","k","","l").dropWhile(s-> !s.isEmpty())
.forEach(System.out::print);
}
}
