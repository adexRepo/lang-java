package learn.lang.collection.application;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
 
    public static void main(String[] args) {

        Map<Integer,Integer> weakKey = new WeakHashMap<>();
        Map<Integer,Integer> hashKey = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            weakKey.put(i, i);
            hashKey.put(i, i);
        }

        System.gc();

        System.out.println(weakKey.size()); //784464 lost almost 250k an
        System.out.println(hashKey.size()); // still 1000000

    }
}
