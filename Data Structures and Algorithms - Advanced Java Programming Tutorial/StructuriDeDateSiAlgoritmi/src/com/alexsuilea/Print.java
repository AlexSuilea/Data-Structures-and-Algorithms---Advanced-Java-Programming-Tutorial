package com.alexsuilea;

import java.util.PriorityQueue;
import java.util.Stack;

public class Print {

    public static void printStringMethods(){
        String words[] = {"funk", "chunk", "fury","baconator"};
        StringMethods.startsWithEndsWith(words, "fu", "unk");
        StringMethods.indexOfExamples("alexandrumihaisuilea", "i", 12);
        StringMethods.indexOfExamples("alexandrumihaisuilea", "xandr",0);
        StringMethods.concatEx("Bacon ", "monster");
        StringMethods.replaceEx("Bacon ");
        StringMethods.toUpperCaseEx("monster ");
        StringMethods.trimEx("                monster                ");
    }

    public static void printRecursion(){
        System.out.println(Recursion.fact(5));
    }

    public static void printArrayListEx1(){
        String[] things1 = {"alex", "eggs", "bacon", "pizza", "java", "LoL", "MC"};
        String[] things2 = {"paine", "pizza", "MC"};
        ArrayListEx.arrayList(things1, things2);
    }

    public static void printLinkedListEx(){
        String[] things1 = {"alex", "eggs", "bacon", "pizza", "java", "LoL", "MC"};
        String[] things2 = {"paine", "pizza", "MC"};
        LinkedListEx.init(things1, things2);
    }

    public static void printConvertArrayToList(){
        String[] things1 = {"alex", "eggs", "bacon", "pizza", "java", "LoL", "MC"};
        ConvertArrayToList.convert(things1);
    }

    public static void printSortMethodEx(){
        String[] things1 = {"cutie", "alex", "eggs", "bacon", "pizza", "java", "lol", "mc", "ma"};
        SortMethodEx.SortMethod(things1);
    }

    public static void printReverseCopyFill(){
        Character[] stuff = {'p','w', 'm', 'y'};
        ReverseCopyFillMethods.reverseCopyFill(stuff);
    }

    public static void printAddAllFrequencyAndDisjointMethods(){
        String[] stuff = {"apples", "beef", "corn", "ham"};
        AddAllFrequencyAndDisjointMethods.examples(stuff);
    }

    public static void printStack(){
        Stack<String> stack = new Stack<String>();
        StackEx.examplePushPop(stack);
    }

    public static void printQueue(){
        PriorityQueue<String> queue = new PriorityQueue<>();
        PriorityQueueEx.example(queue);
    }

    public static void printHashSet(){
        String[] stuff = {"apples", "beef", "corn", "beef", "ham"};
        HashSetEx.example(stuff);
    }

    public static void printGenericClass(){
        GenericClassT.example();
        System.out.println(GenericClassT.max(25,88,26));
        System.out.println(GenericClassT.max("apples","tods","x"));
    }
    
}
