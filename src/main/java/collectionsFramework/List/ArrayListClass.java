package collectionsFramework.List;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String args[]){

         /*
         ■ It implements the interface List.
         ■ It allows null values to be added to it.
         ■ It implements all list operations (add, modify, and delete values).
         ■ It allows duplicate values to be added to it.
         ■ It maintains its insertion order.
         ■ It is non synchronized
         ■ It is slower than LinkedList in adding and removing operations i,e Manipulation is slower
         ■ You can use either Iterator or ListIterator to iterate over the items of an ArrayList.
         ■ It supports generics, making it type safe.
         ■ we can not create list of primitive types, it is required to use the required wrapper class
         -  ArrayList<int> al = ArrayList<int>(); // does not work
         -  ArrayList<Integer> al = new ArrayList<Integer>(); // works fine
         */

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // 1. Add Elements to an ArrayList - add() method with and without the index parameter
             languages.add("Java");
             languages.add("C++");
             languages.add("Python");
             languages.add(3,"Swift"); // adding element at any specific position
             System.out.println("ArrayList: " + languages);

      // 2. Access ArrayList Elements
            String str=languages.get(2);
            System.out.println("Element at index 2:" + str);

      // 3. Change ArrayList Elements
           languages.set(1,"PHP");
           System.out.println("Modified ArrayList"+languages);

     // 4. Remove ArrayList Elements
            String str2 = languages.remove(2);
            System.out.println();
            System.out.println("Updated ArrayList: " + languages);
            System.out.println("Removed Element through index position : " + str2);


       //  Iterate through an ArrayList
        for (String element : languages) {
            System.out.print(element);
            System.out.print(", ");
        }

        /*

        Java ArrayList add()
        inserts the element to the arraylist

        Java ArrayList addAll()
        adds all elements of a collection to arraylist

        Java ArrayList clear()
        removes all the elements from arraylist

        Java ArrayList clone()
        makes a copy of the array list

        Java ArrayList contains()
        checks if the element is present in the arraylist

        Java ArrayList get()
        returns the element present in the specified index

        Java ArrayList indexOf()
        returns the position of the specified element

        Java ArrayList removeAll()
        removes multiple elements from the arraylist

        Java ArrayList remove()
        removes the single element from the arraylist

        Java ArrayList size()
        returns the length of an arraylist

        Java ArrayList isEmpty()
        checks if the arraylist is empty

        Java ArrayList subList()
        returns a portion of the arraylist

        Java ArrayList set()
        replace the single element from an arraylist

        Java ArrayList sort()
        sorts the arraylist according to specified order

        Java ArrayList toArray()
        converts an arraylist to an array

        Java ArrayList toString()
        converts the arraylist into a String

        Java ArrayList ensureCapacity()
        set the size of an arraylist

        Java ArrayList lastIndexOf()
        returns position of last occurrence of the element

        Java ArrayList retainAll()
        retains only the common elements

        Java ArrayList containsAll()
        checks if a collection is a subset of arraylist

        Java ArrayList trimToSize()
        trims the capacity of arraylist equal to the size

        Java ArrayList removeRange()
        removes a portion of the arraylist

        Java ArrayList replaceAll()
        replace all elements from the arraylist

        Java ArrayList removeIf()
        removes element that satisfy the condition

        Java ArrayList forEach()
        performs an action to all elements of arraylist

        Java ArrayList iterator()
        returns an iterate to loop through the ArrayList

         */

        // Efficiency in SEARCHING - it is better to use ArrayList if searching is more frequent operation than add and remove operation.


    }
}

