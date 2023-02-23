package learn.lang.collection.application;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    
    public static void main(String[] args) {
        
        Map<String,String> identity = new IdentityHashMap<>();
        identity.put("adek.try", "ini identity pertama");

        String name = "adek";
        String dot = ".";
        String act = "try";
        String key = name+dot+act;

        identity.put(key, "ini identity kedua");
        
        System.out.println(identity.toString());
        // res : {adek.try=ini identity pertama, adek.try=ini identity kedua}
        // key adek.try ada 2 , karena secara memory dia ditempatinya berbeda. ==
    }

}
