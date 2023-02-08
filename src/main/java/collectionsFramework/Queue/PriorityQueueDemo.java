package collectionsFramework.Queue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String args[]){

        // - Priority Queue -> Basically a FIFO data structure that serves elements
        //   with the highest priority first
        // - Unlike normal queues, priority queue supports only comparable elements, which means that
        //   the elements are either arranged in ascending order or descending order.
        // - It holds the elements or objects which are to be processed by their priorities.
        // - PriorityQueue doesn't allow null values to be stored in the queue.
        // - Insertion order is NOT maintained i,e NOT Index based insertion or deletion.

       // Creating a priority queue
        PriorityQueue<String> queue = new PriorityQueue<>();

        // add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");   // queue.add(null); not allowed i,e it gives exception
        queue.offer("Karan");

        // offer() - Inserts the specified element to the queue. If the queue is full, it returns false.
        queue.offer("Ash");

        // show the elements present in priorityQueue
        System.out.println("PriorityQueue"+queue);


        // Using the peek() method - This method returns the head of the queue.
        System.out.println("head:"+queue.peek());


        // It is used to retrieve, but does not remove, the head of this queue.
        System.out.println("head:"+queue.element());



        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }




        // Descending order. NOTE: by default it is in ascending order but here we are providing method (Collections.reverse());
        Queue<String> abc = new PriorityQueue<>(Collections.reverseOrder());
        abc.add("B");
        abc.add("C");
        abc.add("A");
        abc.add("F");
        abc.add("D");
        while (!abc.isEmpty()) {
            System.out.println(abc.poll());
        }

        // Queue<Double> cgpa = new PriorityQueue<>(Collections.reverseOrder());  // highest first ( descending order)
        Queue<Double> cgpa = new PriorityQueue<>();  // lowest first or ascending
        cgpa.offer(4.0);
        cgpa.offer(3.5);
        cgpa.offer(2.7);
        cgpa.offer(2.5);

        while(!cgpa.isEmpty()){
            System.out.println(cgpa.poll());
        }

    }
}

