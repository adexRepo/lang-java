package learn.lang.collection.application;

import java.util.Map.Entry;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        
        NavigableMap<String,String> navMap = new TreeMap<>();
        navMap.put("firstName", "Adex");
        navMap.put("lastName", "Kristiyanto");
        navMap.put("roleName", "Fullstack");

        System.out.println("navMap: " + navMap);
        
        for (String key : navMap.descendingKeySet()) {
            System.out.println("key: " + key);
        }

        System.out.println("navMap: " + navMap);
        System.out.println(navMap.lowerKey("lastName"));
        System.out.println(navMap.lowerKey("roleName"));
        System.out.println(navMap.higherKey("firstName"));

        Entry<String, String> pollFirstEntry = navMap.pollFirstEntry();   
        System.out.println("pollFirstEntry: " + pollFirstEntry);
        System.out.println("navMap: " + navMap);

        System.out.println("");
        System.out.println("IMMUTABLE");

        // NOTE IMMUTABLE
        NavigableMap<String,String> emptyNav = Collections.emptyNavigableMap();
        System.out.println("emptyNav: " + emptyNav);
        NavigableMap<String,String> immutableNavMap = Collections.unmodifiableNavigableMap(navMap);
        System.out.println("immutableNavMap: " + immutableNavMap);

    }
}
