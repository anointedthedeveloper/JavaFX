package Session3;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String [] args ) {
        Stream.of("H", "O" , "W", "are", "you", "friend?", "end", "next").
        takeWhile(s -> !s.equals("end"))
        .forEach (System.out::println);
    }
}
