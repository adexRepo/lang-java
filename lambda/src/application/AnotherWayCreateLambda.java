package application;

import lambda.SimpleAction;

public class AnotherWayCreateLambda {
    public static void main(String[] args) {
        
        /* --------------------------- //  Way 1 basic -------------------------- */
        SimpleAction simpleAction1 = (String nameAct) ->{
            return "I do " + nameAct;
        };
        System.out.println("simpleAction1: " + simpleAction1.action("eating"));
        System.out.println("");

        /* ---------------- //  Way 2 without type data parameter --------------- */
        SimpleAction simpleAction2 = (nameAct) ->{
            return "I do " + nameAct;
        };
        System.out.println("simpleAction2: " + simpleAction2.action("eating"));
        System.out.println("");

        /* --------------------- //  Way 3 : if just 1 line --------------------- */
        SimpleAction simpleAction3= (nameAct) -> "I do " + nameAct;
        System.out.println("simpleAction3: " + simpleAction3.action("eating"));
        System.out.println("");

        /* --------------- //  Way 4 : if just 1 line and 1 param --------------- */
        SimpleAction simpleAction4= nameAct -> "I do " + nameAct;
        System.out.println("simpleAction4: " + simpleAction4.action("eating"));
        

    }
}
