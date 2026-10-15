package Session1;
import java.util.*;
public class ColourString {
    public static void main(String[] args) {
        //creating arrayList list dynamically
        List<String> list = new ArrayList<>();
        //list is created
        //Time to add elements to the list
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        // Print the list
        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}
