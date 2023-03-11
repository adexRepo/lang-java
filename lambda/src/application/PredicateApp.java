package application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        
        String str = "Adex4";
        /* ----------------------------- without lambda ----------------------------- */
        Predicate<String> predicate1 = new Predicate<String>() {

            @Override
            public boolean test(String value) {
                return value.length() >= 5;
            }
            
        };
        System.out.println(predicate1.test(str));
        
        /* ------------------------------- with lambda ------------------------------ */
        Predicate<String> predicate2 = (val) -> val.length() > 5;
        System.out.println(predicate2.test(str));


    }
}
