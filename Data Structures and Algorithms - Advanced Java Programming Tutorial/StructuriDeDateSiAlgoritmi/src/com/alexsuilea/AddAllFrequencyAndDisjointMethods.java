package com.alexsuilea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAllFrequencyAndDisjointMethods {
    public static void examples(String[] array){
        List<String> list1 = Arrays.asList(array);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("lol");

        for(String s: list2){
            System.out.printf("%s ", s);
        }

        Collections.addAll(list2, array);
        System.out.println();

        for(String s: list2){
            System.out.printf("%s ", s);
        }
        System.out.println();

        System.out.println(Collections.frequency(list2, "lol")); //numara de cate ori apare lol in lista

        boolean tof = Collections.disjoint(list1, list2);

        if(tof){
            System.out.println("These lists don't have anything in common");
        }
        else{
            System.out.println("These lists have something in common");
        }
    }
}
