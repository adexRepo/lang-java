package learn.lang.collection.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
 
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // descending
            }
        };
        
        SortedMap<String,String> sortedMap = new TreeMap<>(stringComparator);
        sortedMap.put("firstName", "Adex");
        sortedMap.put("lastName", "Kristiyanto");
        sortedMap.put("roleName", "Fullstack");

        for(var key : sortedMap.entrySet()){
            System.out.println(key);
        }

        // ------------------------
        SortedMap<String,String> emptySorted = Collections.emptySortedMap();
        SortedMap<String,String> immutableVersion = Collections.unmodifiableSortedMap(sortedMap);
        emptySorted.put("force", "change");  // error
        immutableVersion.put("force", "change"); // error
    }
}
