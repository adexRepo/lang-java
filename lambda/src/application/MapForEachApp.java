package application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> mp = new HashMap<>();

        mp.put("firstName", "Adek");
        mp.put("middleName", "Krist");
        mp.put("LastName", "Tiyanto");

        /* ---------------------------- annonymouse class --------------------------- */
        System.out.println("annonymouse class: ");
        mp.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String key, String value) {
                System.out.println("key: " + key + "  - " + "value: " + value);
            }

        });
        System.out.println("");
        /* --------------------------------- lambda --------------------------------- */
        System.out.println("lambda: ");
        mp.forEach((key, value) -> System.out.println("key: " + key + "  - " + "value: " + value));

    }
}
