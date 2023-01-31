package collectionsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]) {

        //


        /*
           Being an interface, the queue requires, for the declaration, a concrete class,
           and the most common classes are the LinkedList and PriorityQueue in Java.
           Implementations done by these classes are not thread safe.
           If it is required to have a thread safe implementation, PriorityBlockingQueue is an available option. */
/*
    ome of the commonly used methods of the Queue interface are:

     add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
     offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
     element() - Returns the head of the queue. Throws an exception if the queue is empty.
     peek() - Returns the head of the queue. Returns null if the queue is empty.
     remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
     poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
*/



        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");


        System.out.println("Queue elements"+queue);

        System.out.println("Head: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Head: " + queue.peek());
        System.out.println(queue);


    }
}