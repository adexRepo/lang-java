package application;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        
        String str = "Adex";

        /* ----------------------------- without lambda ----------------------------- */
        Function<String,Integer> functionLength1 = new Function<String,Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        System.out.println("jumlah huruf "+str+" : " + functionLength1.apply(str));
        
        /* ------------------------------- with lambda ------------------------------ */
        Function<String,Integer> functionLength2 = (val) -> val.length();
        System.out.println("jumlah huruf "+str+" : " + functionLength2.apply(str));

    }
}
