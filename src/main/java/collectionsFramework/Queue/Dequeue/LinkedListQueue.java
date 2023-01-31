package collectionsFramework.Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String args[]){

        // - Since the LinkedList class also implements the Queue and
        //    the Deque interface, it can implement methods of these interfaces as well.
        // - Here are some of the commonly used methods


        System.out.println("---------------LinkedList as Queue--------------------");

        // LinkedList As Queue
        Queue<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("LinkedList: " + languages);

        // access first element
        String str1 = languages.peek();
        System.out.println("Accessed element: "+ str1);

        // access and remove first element
        String str2 = languages.poll();
        System.out.println("Removed element: " + str2);
        System.out.println("LinkedList after poll() : "+languages);

        // add element at the end
        languages.offer("Swift");
        System.out.println("LinkedList after offer() : "+languages);


        System.out.println("------------------LinkedList as Deque-----------------------------");

        // LinkedList As a Deque
        Deque<String> animals = new LinkedList<>();

        //add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst() : "+animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast() :"+animals);

        // remove first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst() : "+animals);

        // remove last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast() : "+animals);

        // Methods of linkedList working as deque
          // addFirst()	adds the specified element at the beginning of the linked list// addLast()	adds the specified element at the end of the linked list
          // getFirst()	returns the first element
          // getLast()	returns the last element
          // removeFirst()	removes the first element
          // removeLast()	removes the last element
          // peek()	returns the first element (head) of the linked list
          // poll()	returns and removes the first element from the linked list
          // offer()	adds the specified element at the end of the linked list



    // Note: We can also create a LinkedList using interfaces in Java. For example,

        // create linkedlist using List
        List<String> animals1 = new LinkedList<>();

       // creating linkedlist using Queue
        Queue<String> animals2 = new LinkedList<>();

    // creating linkedlist using Deque
        Deque<String> animals3 = new LinkedList<>();

        // Here, if the LinkedList is created using one interface, then we cannot use methods provided by other interfaces.
        //  That is, animals1 cannot use methods specific to Queue and Deque interfaces.



    }

}


