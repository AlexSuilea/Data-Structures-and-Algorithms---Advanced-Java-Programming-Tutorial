package com.alexsuilea;

public class Recursion {

    public static long fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
