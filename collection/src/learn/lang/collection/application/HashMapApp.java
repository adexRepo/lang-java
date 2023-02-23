package learn.lang.collection.application;

import java.util.HashMap;

public class HashMapApp {
 
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<>();
        // put is for update and insert
        map.put("name.first", "adek");
        map.put("name.middle", "krist");
        map.put("name.last", "bob");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }

}
