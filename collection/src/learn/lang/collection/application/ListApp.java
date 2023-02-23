package learn.lang.collection.application;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class ListApp {
    
    public static void main(String[] args) {
        
        List<String> listArrayStrings = new ArrayList<>();
        // List<String> listLinkedStrings = new LinkedList<>();
        
        listArrayStrings.add("Adek");
        listArrayStrings.add("Bob");
        listArrayStrings.add("Fred");

        listArrayStrings.set(2, "tom");
        System.out.println(listArrayStrings.get(0));
        listArrayStrings.remove(0);

        System.out.println("-------------------");
        for (String itemStr : listArrayStrings) {
            System.out.println(itemStr);
        }
    }

}
