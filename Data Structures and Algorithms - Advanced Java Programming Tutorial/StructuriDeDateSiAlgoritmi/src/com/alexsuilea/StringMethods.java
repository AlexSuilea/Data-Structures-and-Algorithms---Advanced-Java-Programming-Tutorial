package com.alexsuilea;

public class StringMethods {

    public static void startsWithEndsWith(String[] words, String start, String end){
        for(String w: words){
            if(w.startsWith(start)){
                System.out.println(w + " starts with " +start);
            }
        }

        for(String w: words){
            if(w.endsWith(end)){
                System.out.println(w + " ends with " + end);
            }
        }
    }

    public static void indexOfExamples(String s, String ch, int num){
        System.out.println(s.indexOf(ch));
        System.out.println(s.indexOf(ch,num)); //ignora toate carcterele pana la pozitia num
        System.out.println(s.indexOf("b"));
    }

    public static void concatEx(String a, String b){
        System.out.println(a.concat(b));
    }

    public static void replaceEx(String a){
        System.out.println(a.replace("B","F"));
    }

    public static void toUpperCaseEx(String a){
        System.out.println(a.toUpperCase());
    }

    public static void trimEx(String a){
        System.out.println(a.trim());
    }
}
