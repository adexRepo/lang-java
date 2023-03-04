package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 1_000_000; i++) {
            list.add(i);
        }

        // without comparator
        var idx = Collections.binarySearch(list, 57);
        System.out.println("idx: " + idx);
        System.out.println("val idx :" + list.get(idx));

        // with comparator
        
    }

}
