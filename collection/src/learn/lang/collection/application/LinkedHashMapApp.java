package learn.lang.collection.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    
    public static void main(String[] args) {
        
        // Map<String,String> map = new HashMap<>(); // untuk compare kalo ini ga berurut
        Map<String,String> map = new LinkedHashMap<>();
        map.put("first", "adek");
        map.put("last", "dupin");
        map.put("middle", "krist");
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }

}
