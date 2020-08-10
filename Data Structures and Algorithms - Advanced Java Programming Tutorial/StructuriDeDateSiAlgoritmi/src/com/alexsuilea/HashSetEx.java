package com.alexsuilea;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSetEx {
    public static void example(String[] array){
        List<String> stuff = Arrays.asList(array);
        System.out.printf("%s ", stuff);
        System.out.println();

        Set<String> set = new HashSet<String>(stuff);
        System.out.printf("%s ", set);
    }
}
