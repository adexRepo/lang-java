package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        
        List<String> list =  new ArrayList<>();
        list.addAll(List.of("adek","krist","krist","tiyanto","full","learn","java"));
        System.out.println("original : list: " + list);
        
        Collections.reverse(list);
        System.out.println("reverse list: " + list);

        Collections.shuffle(list);
        System.out.println("reverse list: " + list);

        int countFreq = Collections.frequency(list, "krist");
        System.out.println("countFreq: " + countFreq);

    }
}
