package collectionsFramework.Queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String args[]){

        /*  -ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
           -Unlike queue, we can add or delete the elements from both the ends.
          -ArrayDeque is faster than ArrayList,LinkedList & Stack and has no capacity restrictions.
          -Null elements are not allowed in the ArrayDeque.
         */

        // Creating string type ArrayDeque
        ArrayDeque<String> animals =new ArrayDeque<String>();


        // Using add()
        animals.add("Dog");

        // Using add()
        animals.add("Cow");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);


        //1. Access elements using getFirst() and getLast()  ( Also peekFirst()+peek()=FirstElement AND peekLast()=last element of array deque )

        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last Element: "+animals.getLast());

        // 1. Remove elements using the remove(), removeFirst(), removeLast() method


        // Using remove()
        String element = animals.remove();
        System.out.println("Removed Element: " + element);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using removeLast()
        String lastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);

        System.out.println(animals);

        // 2. Remove elements using the poll()-returns+removes 1st element, pollFirst()=poll() and pollLast()=return+delete last element -- --> Same as remove methods



       //  System.out.println("Head: " + deque.peek());
       //   System.out.println("Removed: " + deque.remove());
       //  System.out.println("Head: " + deque.peek());

        /* Note: If the array deque is full
          -(both are same methods i,e offer(),add()-offerFirst(),addFirst etc)
           the add() method will throw an exception
           the offer() method returns false
        */
    }
}
