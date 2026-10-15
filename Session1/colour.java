package Session1;
import java.util.*;
public class Colour {
    public static void main(String[] args) {
        //creating arrayList list dynamically
        List<String> list = new ArrayList<>();
        //list is created
        //Time to add elements to the list
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            //Printing elements of an array
            System.out.println(data);
        }
    }
}
