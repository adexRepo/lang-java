package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("adek1");
        list.add("adek4");
        list.add("adek3");
        list.add("adek2");
        list.add("adek5");
        System.out.println("before sorting list: " + list);
        
        Collections.sort(list);
        System.out.println("after sorting list: " + list);

        // pakai comparator
        Comparator<String> comparatorReverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list,comparatorReverse);
        System.out.println("sorting reverse list: " + list);


    }

}
