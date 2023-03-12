package application;

import java.util.Optional;

public class LambdaOptionalApp {

    public static void main(String[] args) {
        sayHello("Adek");
        sayHello(null); // err java.lang.NullPointerException kalo tanpa Optional
    }

    public static void sayHello(String name) {
        /* ------------------------------ with optional ----------------------------- */
        // * basic
        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalNameUpper =
        // optionalName.map((val)->val.toUpperCase());
        // optionalNameUpper.ifPresent((value)->System.out.println("Woi: " + value));

        // * chain
        // Optional.ofNullable(name)
        //         .map((val) -> val.toUpperCase())
        //         .ifPresentOrElse(
        //                 (val) -> System.out.println("Woi: " + val),
        //                 () -> System.out.println("Woi: "));

        // * chain + method reference
        // Optional.ofNullable(name)
        //         .map(String::toUpperCase)
        //         .ifPresent(System.out::println);

        // * or else
        String upperName = Optional.ofNullable(name)
                .map((val) -> val.toUpperCase())
                .orElse("Tomodachi!"); // atau ada juga orElseGet yang perlu supplier<T> biar jadi lazy

        System.out.println("Woi: " + upperName);
        

        /* ------------------------------ non optional ------------------------------ */
        // if(name != null){
        // String upperName = name.toUpperCase();
        // System.out.println("Woi: " + upperName);
        // }
    }

    // * map itu mentransform / mengubah suatu object ke object lain nya
}
