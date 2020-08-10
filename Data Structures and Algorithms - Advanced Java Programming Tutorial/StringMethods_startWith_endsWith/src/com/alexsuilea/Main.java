package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        String words[] = {"funk", "chunk", "fury","baconator"};
        startsWithEndsWith(words, "fu", "unk");

    }

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
}
