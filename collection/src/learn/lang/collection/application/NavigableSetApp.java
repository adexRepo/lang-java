package learn.lang.collection.application;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Adek", "krop", "uncle fre", "Bob", "Troks"));

        for (String name : names) {
            System.out.println(name);
        }
        // Adek
        // Bob
        // Troks
        // krop
        // uncle fre

        NavigableSet<String> namesReverse = names.descendingSet();

        System.out.println("--------------------------------------");
        for (String name : namesReverse) {
            System.out.println(name);
        }
        // uncle fre
        // krop
        // Troks
        // Bob
        // Adek

        NavigableSet<String> ambilBob = names.tailSet("Bob", false); // false mean Bob not include

        System.out.println("--------------------------------------");
        for (String string : ambilBob) {
            System.out.println(string);
        }

        // Troks
        // krop
        // uncle fre

        NavigableSet<String> ambilBobUnModify = Collections.unmodifiableNavigableSet(ambilBob);

        ambilBobUnModify.add("try error"); //java.lang.UnsupportedOperationException
    }

}
