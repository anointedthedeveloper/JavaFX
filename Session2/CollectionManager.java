package Session2;

import java.util.*;

public class CollectionManager {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        // Adding items
        items.add("Alpha Project");
        items.add("Beta Suite");
        items.add("Gamma Docs");

        // Display all items
        System.out.println("Full Collection");
        for (String item : items) {
            System.out.println(item);
        }

        // Remove an item
        items.remove("Beta Suite");

        // Display updated list
        System.out.println("\nUpdated Collection");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
