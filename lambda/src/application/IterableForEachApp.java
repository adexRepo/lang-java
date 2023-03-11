package application;

import java.util.List;
import java.util.function.Consumer;

public class IterableForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Adek", "Krist", "Tiyanto");

        /* -------------------------------- for loop -------------------------------- */
        for (String item : list) {
            System.out.println("for loop: " + item);
        }
        System.out.println("");
        
        /* ---------------------------------- basic --------------------------------- */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String itemList) {
                System.out.println("anonymouse class: " + itemList.toUpperCase());
            }
        });
        System.out.println("");

        /* --------------------------------- lambda --------------------------------- */
        list.forEach(val -> System.out.println("lambda: " + val.toUpperCase()));
        System.out.println("");

        /* ------------------------------- alternative ------------------------------ */
        list.forEach(System.out::println);
    }
}
