package learn.lang.collection.application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap<>();        
        map.put("firstName", "Adex");
        map.put("lastName", "Kristiyanto");
        map.put("roleName", "Fullstack");

        Collection<String> values = map.values();
        System.out.println("values: " + values);

        // ----
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (var entry : entries) {

            System.out.println("key: " + entry.getKey() +" : "+"value: " + entry.getValue());
            
        }


    }
}
