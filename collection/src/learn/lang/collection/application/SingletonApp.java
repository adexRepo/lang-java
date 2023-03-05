package learn.lang.collection.application;

import learn.lang.collection.collection.SimpleSingletonCounter;

public class SingletonApp {

    public static void main(String[] args) {
        
        SimpleSingletonCounter single1 =  SimpleSingletonCounter.getObj();
        SimpleSingletonCounter single2 =  SimpleSingletonCounter.getObj();
        SimpleSingletonCounter single3 =  SimpleSingletonCounter.getObj();

        single1.increment();
        single2.increment();
        single3.increment();

        System.out.println("single1: " + single1.getCounter());
        System.out.println("single2: " + single2.getCounter());
        System.out.println("single3: " + single3.getCounter());

    }

}