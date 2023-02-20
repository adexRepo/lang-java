package learn.lang.collection.application;

import java.util.HashSet;
// import java.util.LinkedHashSet; 
import java.util.Set;

public class SetApp {
    
    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();        
        // Set<String> names = new LinkedHashSet<>();        
        names.add("adek");
        names.add("uncle fred");
        names.add("bob");
        names.add("adek");
        names.add("uncle fred");
        names.add("bob");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
