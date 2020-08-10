package com.alexsuilea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCopyFillMethods {
    public static void reverseCopyFill(Character[] array){
        List<Character> list = Arrays.asList(array);

        System.out.println("List is: ");
        output(list);

        //reverse the list
        Collections.reverse(list);
        System.out.println("List after reverse: ");
        output(list);

        Character[] newArray = new Character[array.length];
        List<Character> listCopy = Arrays.asList(newArray);

        Collections.copy(listCopy, list);
        System.out.println("Copy of the list: ");
        output(listCopy);

        Collections.fill(list, 'X');
        System.out.println("After filling the list ");
        output(list);
    }

    private static void output(List<Character> theList){

        for(Character ch: theList){
            System.out.printf("%s ", ch);
        }
        System.out.println();
    }
}
