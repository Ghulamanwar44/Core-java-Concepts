package collectionsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]) {

        /*
           -
           -If it is required to have a thread safe implementation, PriorityBlockingQueue is an available option.
        */

        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.offer("Fourth");
        queue.add(null);
        queue.add(null);

        System.out.println("Queue elements"+queue);

        System.out.println("Head: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Head: " + queue.peek());
        System.out.println(queue);


    }
}