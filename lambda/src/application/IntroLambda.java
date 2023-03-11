package application;

import lambda.SimpleLambda;

public class IntroLambda {
    
    public static void main(String[] args) {
        
        // without lambda
        SimpleLambda anonySimpleWithoutLambda = new SimpleLambda() {
            @Override
            public String doSomething() {
                return "Anonymouse class without lambda";
            }
        };
        System.out.println(anonySimpleWithoutLambda.doSomething());
        
        System.out.println("");
        
        // with lambda
        SimpleLambda anonySimpleWithLambda = () -> {
            return "Anonymouse class with lambda";
        };
        System.out.println(anonySimpleWithLambda.doSomething());
    }

}
