package com.alexsuilea;

import java.util.Stack;

public class StackEx {

    public static void examplePushPop(Stack<String> stack){
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> stack){
        if(stack.isEmpty()){
            System.out.println("There are no elements in the stack.");
        } else {
            System.out.printf("%s TOP\n", stack);
        }
    }
}
