package learn.lang.collection.application;

import java.util.Arrays;
import java.util.List;

public class ConversionToArrayApp {
    public static void main(String[] args) {
        
        List<String> names = List.of("adex1", "adex2", "adex3", "adex4", "adex5", "adex6", "adex7", "adex8", "adex9", "adex10");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
