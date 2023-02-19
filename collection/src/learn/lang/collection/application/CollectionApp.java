package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {

        Collection<String> namesCollection = new ArrayList<>();
        namesCollection.add("Adek");
        namesCollection.add("Krist");
        namesCollection.add("Tiyanto");
        namesCollection.addAll(List.of("Dupin", "Uncle Fred"));
        for (String name : namesCollection) {
            System.out.println(name);
        }
        System.out.println("-------------");
        namesCollection.remove("Tiyanto");
        for (String name : namesCollection) {
            System.out.println(name);
        }
        System.out.println("-------------");
        System.out.println(namesCollection.contains("Adek"));
        System.out.println(namesCollection.contains("Tiyanto"));
        System.out.println(namesCollection.containsAll(List.of("Krist","Dupin")));
        System.out.println(namesCollection.size());
    }

}
