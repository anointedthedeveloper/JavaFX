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
        String[] str = list.toArray(new String[0]);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " ");
        }
    }
}
