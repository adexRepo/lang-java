package learn.lang.generic.application;

import learn.lang.generic.Pair;

public class PairApp {
    
    public static void main(String[] args) {
        
        Pair<String,String> data = new Pair<String,String>("aku","sleepy");

        System.out.println(data.toString());
    }
    


}
