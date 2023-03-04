package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethodCollectionApp {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        System.out.println("numbers: " + numbers);
        System.out.println("");
        numbers.replaceAll(new UnaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * 10;
                // return t % 2 == 0 ? 0 : t;
            }

        });

        System.out.println("replaceAll: " + numbers);
        System.out.println("");

        // replace forEach
        numbers.forEach(new Consumer<Integer>() {
            // not using lambda
            @Override
            public void accept(Integer t) {
                t = t + 8;
                System.out.println(t);
            }
        });

        System.out.println("numbers: " + numbers);
        System.out.println("");
        // remove if
        numbers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                return t > 300;
            }
        });
        System.out.println("removeIf: " + numbers);
    }
}
