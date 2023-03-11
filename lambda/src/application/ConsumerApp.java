package application;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {
        /* --------------------- util function without lambda -------------------- */
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("value: " + value);
            }
        };
        consumer1.accept("Adex1");

        /* ------------------------ util function with lambda ----------------------- */
        Consumer<String> consumer2 = (value) -> {
            System.out.println("value: " + value);
        };
        consumer2.accept("Adex2");

        // or
        Consumer<String> consumer3 = (value) -> System.out.println("value: " + value);
        consumer3.accept("Adex3");

        // or
        Consumer<String> consumer4 = value -> System.out.println("value: " + value);
        consumer4.accept("Adex4");

        System.out.println("");

        /* ------------------------------ in collection ----------------------------- */
        System.out.println("----- in collection -----");
        
        List<String> list = List.of("Adek1", "Adek2", "Adek3");

        // without lambda
        System.out.println("without lambda: ");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("value: " + value);
            }
        });

        // with lambda
        System.out.println("");
        System.out.println("with lambda: ");
        list.forEach(consumer4);

    }

}
