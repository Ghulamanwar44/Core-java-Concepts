package chapter8.collectionsFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String args[]){

        // Java LinkedHashMap maintains insertion order.
        // Java LinkedHashMap may have one null key and multiple null values.
        // It is the same as HashMap with an additional feature that it maintains insertion order.
        // Java LinkedHashMap is non synchronized.
        //  It inherits HashMap class and implements the Map interface.
        // LinkedHashMap maintains a doubly-linked list internally. Due to this, it maintains the insertion order of its elements.
        //  The performance of LinkedHashMap is slower than HashMap


        // Initialization of a LinkedHashMap
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();

        // Operation 1: Insertion - Adding Elements
        lhm.put(3,"Geeks");
        lhm.put(2,"Geeks");
        lhm.put(1,"Geeks");
        lhm.put(4,"Geeks");
        lhm.put(5,null);
        // Printing mappings to the console
        System.out.println("Initial map : " + lhm);

        // Operation 2: Changing/Updating Elements
        lhm.put(2, "For");

        // Printing the updated Map
        System.out.println("Updated Map : " + lhm);

        // Operation 3: Removing Element
        lhm.remove(4); // remove mapping with key 4 :

        // Printing the updated map
        System.out.println("Updated Map : " + lhm);

       // Operation 4: Iterating through the LinkedHashMap
        for (Map.Entry<Integer,String> e: lhm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

      // 5-  Access LinkedHashMap Elements

        //1- Using entrySet()
        System.out.println("key/value mappings : "+lhm.entrySet());
        // Using keySet()
        System.out.println("Keys:"+lhm.keySet());
        // Using values()
        System.out.println("values:"+lhm.values());
       // 2. Using get()
        System.out.println(lhm.get(1));
       // Using getOrDefault()
        System.out.println(lhm.getOrDefault(2,"defaultValue"));

        // Removed LinkedHashMap Elements
        // remove(key) - returns and removes the entry associated with the specified key from the map
        // remove(key, value) - removes the entry from the map only if the specified key mapped to be the specified value and return a boolean value
    }
}

  // Other methods of linkedHashMap
   /*
    -clear()	     removes all the entries from the map
    -containsKey()	 checks if the map contains the specified key and returns a boolean value
    -containsValue() checks if the map contains the specified value and returns a boolean value
    -size()	         returns the size of the map
    -isEmpty()	     checks if the map is empty and returns a boolean value
     */