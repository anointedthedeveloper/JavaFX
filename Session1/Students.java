package Session1;

import java.util.ArrayList;
import java.util.List;

public class Students {
     public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> list_Students = new ArrayList<String>();
        list_Students.add("Anointed");
        list_Students.add("Kamsy");
        list_Students.add("Demilade");
        // Print the list
        System.out.println(list_Students);
        // Now insert a color at the first and last position of the list
        list_Students.add(0, "Dexter");
        list_Students.add(1, "Thomas");
        list_Students.add(5, "Thomas");
        // Print the list
        System.out.println(list_Students);
    }
}
