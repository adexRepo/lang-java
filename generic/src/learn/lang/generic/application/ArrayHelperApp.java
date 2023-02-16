package learn.lang.generic.application;

import learn.lang.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        
        String[] names = {"Bob","sam","fred"};
        Integer[] ages = {34,45,55,98};

        // System.out.println(ArrayHelper.<String>count(names)); // not mandatory this format
        System.out.println(ArrayHelper.count(names));
        // System.out.println(ArrayHelper.<Integer>count(ages)); // not mandatory this format
        System.out.println(ArrayHelper.count(ages));

    }

}
