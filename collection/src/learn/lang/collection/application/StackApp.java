package learn.lang.collection.application;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stacks = new Stack<>();
        stacks.push("ade");
        stacks.push("kris");
        stacks.push("jon");

        String pop1 = stacks.pop();
        System.out.println("pop1: " + pop1);

        System.out.println("");

        for (String stack : stacks) {
            System.out.println("stack: " + stack); // get all java.util.EmptyStackException
        }
        System.out.println("stacks: " + stacks);
        System.out.println("");

        try {
            for (var val = stacks.pop(); val != null; val = stacks.pop()) {
                System.out.println("val: " + val);
            }
        }
        catch (Exception err) {
            System.out.println("err: " + err);
        }

    }
}
