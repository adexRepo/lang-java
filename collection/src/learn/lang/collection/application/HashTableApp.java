package learn.lang.collection.application;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        
        Map<String,String> hashTable = new Hashtable<>(); // syncronized
        hashTable.put("name1","adex" );
        hashTable.put("name2","crist");
        hashTable.put("name3","eat"  );

        for (String key : hashTable.keySet()) {
            System.out.println("key: " + key);
        }

    }
}
