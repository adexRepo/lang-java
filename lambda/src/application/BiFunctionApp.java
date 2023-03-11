package application;

import java.util.function.BiFunction;

public class BiFunctionApp {
    public static void main(String[] args) {
    
        String str1 = "Adek";
        String str2 = "Adek";

        /* ----------------------------- without lambda ----------------------------- */
        BiFunction<String,String,Boolean> compareParam1 = new BiFunction<String,String,Boolean>() {
            @Override
            public Boolean apply(String first, String second) {
                return first.equals(second);
            }
        };

        Boolean isSampe1 = compareParam1.apply(str1, str2);
        System.out.println("isSampe1: " + isSampe1);

        /* ------------------------------- with lambda ------------------------------ */
        BiFunction<String,String,Boolean> compareParam2 = (val1,val2) -> val1.equals(val2); 
        Boolean isSampe2 = compareParam2.apply(str1, str2);
        System.out.println("isSampe2: " + isSampe2);



    }

}
