package com.alexsuilea;

public class GenericClassT {
    public static void example(){
        Integer[] iArray = {1,2,3,4};
        Character[] cArray = {'a','l','e','x'};

        printMe(iArray);
        printMe(cArray);
    }

    public static <T> void printMe(T[] array){
        for(T i: array){
            System.out.printf("%s ", i);
        }
        System.out.println();
        //T Rezolva problema overloading-ului de metode
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;
        if(b.compareTo(m) > 0)
            m = b;

        if(c.compareTo(m) > 0)
            m = c;

        return m;
    }

}
