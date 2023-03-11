package application;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceNonStaticApp {
    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c))
                return false;
        }

        return true;
    }

    public void run() {

        /* -------------------------------------------------------------------------- */
        /*                      Method Reference non Static basic                     */
        /* -------------------------------------------------------------------------- */
        System.out.println("");
        System.out.println("Method Reference non Static basic : lambda without method reference");
        /* --------------------- lambda without method reference -------------------- */
        Predicate<String> predicateIsLower1 = (val) -> this.isLowerCase(val); // if same file
        System.out.println(predicateIsLower1.test("Adex"));
        System.out.println(predicateIsLower1.test("adex"));
        
        System.out.println("");
        System.out.println("Method Reference non Static basic : lambda with method reference");
        /* ----------------------- lamda with method reference ---------------------- */
        Predicate<String> predicateIsLower2 = this::isLowerCase; // if same file
        System.out.println(predicateIsLower2.test("Adex"));
        System.out.println(predicateIsLower2.test("adex"));
        // * generic type nya wajib sama dan jumlah parameternya harus 1


        /* -------------------------------------------------------------------------- */
        /*                 Method Reference non static in other object                */
        /* -------------------------------------------------------------------------- */
        System.out.println("");
        System.out.println("Method Reference non static in other object");
        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp(); // * [if other object]
        Predicate<String> predicateIsLower3 = (val) -> app.isLowerCase(val); // * [if other object]
        Predicate<String> predicateIsLower4 = app::isLowerCase; // * [if other object]

        System.out.println(predicateIsLower3.test("Adex"));
        System.out.println(predicateIsLower3.test("adex"));
        System.out.println(predicateIsLower4.test("Adex"));
        System.out.println(predicateIsLower4.test("adex"));

        /* -------------------------------------------------------------------------- */
        /*                 Method Reference access method in parameter                */
        /* -------------------------------------------------------------------------- */
        System.out.println("");
        System.out.println("Method Reference access method in parameter");
        Function<String,String> funcUpper1 = value -> value.toUpperCase();
        Function<String,String> funcUpper2 = String::toUpperCase; // tipe datanya
        funcUpper1.apply("backend-developer");
        funcUpper2.apply("backend-developer");
        

    }

    public static void main(String[] args) {

        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp();
        app.run();

    }

}
