package chapter8.collectionsFramework.List;

import java.util.Vector;

public class VectorClassDemo {
    public static void main(String args[]){


        // It is recommended to use the Vector class in the thread-safe implementation only.
        // Vector is synchronized.
        // It is a legacy class.
        // It increases its size by doubling the array size i.e. 100%
        // Vector is slow as compared ArrayList because it is synchronized

        // create Integer type linked list
        Vector<String> vector= new Vector<>();

        // Adding elements
        vector.add("One");
        vector.add(1,"Two");

      // Access Vector Elements
        System.out.println("Element at index 2: " + vector.get(1));

        // Remove methods

        /*
         remove(index) - removes an element from specified position
         removeAll() - removes all the elements
         clear() - removes all elements. It is more efficient than removeAll()
       */


        /*

          ----    Others Vector Methods-----
            Methods   	Descriptions
            set()	     changes an element of the vector
            size()	     returns the size of the vector
           toArray()	 converts the vector into an array
           toString()	 converts the vector into a String
           contains()	 searches the vector for specified element and returns a boolean result


        */
    }
}
