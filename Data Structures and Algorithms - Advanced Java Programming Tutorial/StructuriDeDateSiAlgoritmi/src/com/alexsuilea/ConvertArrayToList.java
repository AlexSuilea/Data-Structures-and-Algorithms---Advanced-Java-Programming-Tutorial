package com.alexsuilea;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertArrayToList {

    public static void convert(String[] array){
        LinkedList<String> stuff = new LinkedList<String>(Arrays.asList(array)); //convertire array la linked list

        stuff.add("stilou");
        stuff.addFirst("Java");
        stuff.add(2, "xyz");

        array = stuff.toArray(new String[0]);

        for(String x: array){
            System.out.printf("%s ", x);
        }
    }
}
