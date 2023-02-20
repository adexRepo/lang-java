package learn.lang.collection.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {

    public static void main(String[] args) {

        Set<String> empty =  Collections.emptySet();
        System.out.println(empty);
        Set<String> one = Collections.singleton("Coffe Jean Doe"); 
        System.out.println(one);
        Set<String> mutableSet = new HashSet<>();  
        mutableSet.add("Adek");
        mutableSet.add("Krist");
        mutableSet.add("Jone");
        System.out.println(mutableSet);
        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);
        System.out.println(immutableSet);
        
        Set<String> set = Set.of("Dukun","Corket","praffaite");
        System.out.println(set);
        
        // set.add("null"); error
        // set.remove("Dukun"); error
    







    }
}
