package com.alexsuilea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMethodEx {

    public static void SortMethod(String[] array){
        List<String> stuff = Arrays.asList(array);

        Collections.sort(stuff);
        System.out.printf("%s\n", stuff);

        Collections.sort(stuff, Collections.reverseOrder());
        System.out.printf("%s\n", stuff);
    }
}
