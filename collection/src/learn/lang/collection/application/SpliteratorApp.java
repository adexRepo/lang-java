package learn.lang.collection.application;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> names = List.of("adex1", "adex2", "adex3", "adex4", "adex5", "adex6", "adex7", "adex8", "adex9", "adex10");
        // intinya split seperti membagi jadi beberapa ,, ini cocok buat pageable
        Spliterator<String> splitNames1 = names.spliterator();
        Spliterator<String> splitNames2 = splitNames1.trySplit();
        Spliterator<String> splitNames3 = splitNames1.trySplit();
        long size1 = splitNames1.estimateSize();
        long size2 = splitNames2.estimateSize();
        long size3 = splitNames3.estimateSize();
        System.out.println("size: " + size1);
        System.out.println("size: " + size2);
        System.out.println("size: " + size3);
        splitNames1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("splitNames1 name: " + name);
            }
        });
        System.out.println("");
        splitNames2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("splitNames2 name: " + name);
            }
        });
        System.out.println("");
        splitNames3.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("splitNames3 name: " + name);
            }
        });
    }
}
