package com.alexsuilea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void arrayList(String[] array1, String[] array2){
        List<String> list1 = new ArrayList<String>();

        for(String w: array1){
            list1.add(w);
        }

        List<String> list2 = new ArrayList<String>();
        for(String w: array2){
            list2.add(w);
        }

        editList(list1, list2);
        System.out.println();

        for(int i=0; i<list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }
}
