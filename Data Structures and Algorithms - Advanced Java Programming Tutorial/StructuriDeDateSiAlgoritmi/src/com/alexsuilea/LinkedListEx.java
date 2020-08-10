package com.alexsuilea;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {
    public static void init(String[] array1, String[] array2){
        List<String> list1 = new LinkedList<String>();
        for(String x: array1){
            list1.add(x);
        }

        List<String> list2 = new LinkedList<String>();
        for(String y: array2){
            list2.add(y);
        }
        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }

    private static void printMe(List<String> list){
        for(String i: list){
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    private static void removeStuff(List<String> list, int from, int to){
        list.subList(from, to).clear();
    }

    private static void reverseMe(List<String> list){
        ListIterator<String> bobby = list.listIterator(list.size());
        //list.size() -> starting point
        while(bobby.hasPrevious()){
            System.out.printf("%s ", bobby.previous());
        }
    }
}
