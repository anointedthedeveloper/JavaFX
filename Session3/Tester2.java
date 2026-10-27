// Extracted Java code snippet 03 from the supplied notes.
import java.util.stream.IntStream;
public class Tester2 {
public static void main(String[] args) {
IntStream.iterate(4, x -> x < 11, x -> x+ 4).forEach(
System.out::println);
}
}
