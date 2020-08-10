package com.alexsuilea;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void example(PriorityQueue<String> queue){
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.printf("%s ", queue);
        System.out.println();

        System.out.printf("%s", queue.peek()); //primul element este cel mai important si afectat
        System.out.println();

        queue.poll();
        System.out.printf("%s ", queue);
    }
}
