package learn.lang.collection.application;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        Iterable<String> names = List.of("Adek", "Krist", "Tiyanto");

        // pakai for-each (java 5)
        System.out.println("FOR EACH");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---");

        // pakai iterator (before java 5)
        System.out.println("ITERATOR");
        Iterator<String> iteratorNames = names.iterator();

        while (iteratorNames.hasNext()) {
            String name = iteratorNames.next();
            System.out.println(name);
        }

    }

}
