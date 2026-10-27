// Extracted Java code snippet 01 from the supplied notes.
import java.util.stream.Stream;
public class StreamDemo {
public static void main(String[] args) {
Stream.of("H","o","w"," are"," you", ", friend? ","end", "next").
takeWhile(s->!s.equals("end"))
.forEach(System.out::print);
}
}
