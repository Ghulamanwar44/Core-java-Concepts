package collectionsFramework.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String []args){
        /*
        -Java LinkedList class can contain duplicate elements and null elements.
        -Java LinkedList class maintains insertion order.
        -Java LinkedList class is non synchronized.
        -In Java LinkedList class, manipulation is fast because no shifting needs to occur.
        -Java LinkedList class can be used as a list, stack or queue.
        -Java's LinkedList is not index-based.
      */


        // create Linked list
        LinkedList names=new LinkedList();

        // 1.Add elements to linkedList
        names.add("Deepak");
        names.add("Harris");
        names.add("Alice");
        names.add("Harris");      //  allowed duplicates
        names.add(null);         //  allowed null values
        names.add(4,"Alee"); // add element at the specified position

        // add element at the beginning of linkedList
        names.addFirst("Anwar");

        // add element at the end of linked list
        names.addLast("Zohaib");

        // access first element
        names.getFirst();

        // access last
        names.getLast();

        System.out.println("Updated LinkedList: " + names);



        /*  LINKED LIST AS DEQUE AND QUEUE

        addFirst()	adds the specified element at the beginning of the linked list
        addLast()	adds the specified element at the end of the linked list
        getFirst()	returns the first element
        getLast()	returns the last element
        removeFirst()	removes the first element
        removeLast()	removes the last element
        peek()	returns the first element (head) of the linked list
        poll()	returns and removes the first element from the linked list
        offer()	adds the specified element at the end of the linked list
         */

    // More about java LinkedList methods : https://javagoal.com/java-linked-list-methods/





    }
}
