package learn.lang.collection.application;

import java.util.List;
import java.util.Vector;

public class VectorApp {

    public static void main(String[] args) {

        List<String> listVector = new Vector<>(); // synchronized
        listVector.add("adex");
        listVector.add("crist");
        listVector.add("eat");

        for (var str : listVector) { 
            System.out.println("str: " + str);
        }

    }

}
