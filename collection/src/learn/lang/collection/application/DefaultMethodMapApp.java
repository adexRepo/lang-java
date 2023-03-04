package learn.lang.collection.application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class DefaultMethodMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("one", "adex");
        map.put("two", "adex2");
        map.put("three", "adex3");
        map.put("four", "adex4");

        String res1 = map.getOrDefault("key", "jon");
        System.out.println("getOrDefault map: " + res1);

        System.out.println("");
        map.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }

        });
        System.out.println("");
        map.replaceAll(new BiFunction<String, String, String>() {

            @Override
            public String apply(String key, String value) {
                if (key == "one") {
                    return "TRALALALA";
                }
                return value;
            }

        });
        System.out.println("map replaceAll: " + map);
        System.out.println("");
        
        map.putIfAbsent("five","adex6");
        System.out.println("map putIfAbsent: " + map);
        System.out.println("");
        
        map.remove("five","adex6");
        System.out.println("map remove: " + map);
        System.out.println("");

        map.replace("one","TRALALALA","TRALALALA");
        System.out.println("map replace : " + map);
        System.out.println("");
        // var res7 = map.computeIfAbsent(key,function);
        // var res8 = map.computeIfPresent(key,function);

    }
}
