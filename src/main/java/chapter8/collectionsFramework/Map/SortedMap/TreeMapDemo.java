package chapter8.collectionsFramework.Map.SortedMap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]){

        // Java TreeMap class is a red-black tree based implementation.
        // It provides an efficient means of storing key-value pairs in sorted order.
        // Java TreeMap cannot have a null key but can have multiple null values.
        // Java TreeMap is non synchronized.
        // Java TreeMap maintains ascending order.

       // Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

        System.out.println("----------Insert Elements to TreeMap-----------");

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);


        System.out.println("------------Access TreeMap Elements-----------------");

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
        // get() + getOrDefault()

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);


        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated TreeMap: " + numbers);

        // Replace TreeMap elements Using replace()
        numbers.replace("Second", 22);
        numbers.replace("Third", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);



        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);

        // Methods for Navigation
        // Since the TreeMap class implements NavigableMap, it provides various methods to navigate over the elements of the treemap.
        // 1. ---------First and Last Methods-------------
        System.out.println("First Key: " + numbers.firstKey());
        System.out.println("Last Key: " + numbers.lastKey());
        System.out.println("First Entry: " + numbers.firstEntry());
        System.out.println("Last Entry: " + numbers.lastEntry());



    }
}

 /*
  2 -----Ceiling, Floor, Higher and Lower Methods----
   higherKey() - Returns the lowest key among those keys that are greater than the specified key.
   higherEntry() - Returns an entry associated with a key that is lowest among all those keys greater than the specified key.
   lowerKey() - Returns the greatest key among all those keys that are less than the specified key.
   lowerEntry() - Returns an entry associated with a key that is greatest among all those keys that are less than the specified key.
   ceilingKey() - Returns the lowest key among those keys that are greater than the specified key. If the key passed as an argument is present in the map, it returns that key.
   ceilingEntry() - Returns an entry associated with a key that is lowest among those keys that are greater than the specified key. It an entry associated with the key passed an argument is present in the map, it returns the entry associated with that key.
   floorKey() - Returns the greatest key among those keys that are less than the specified key. If the key passed as an argument is present, it returns that key.
   floorEntry() - Returns an entry associated with a key that is greatest among those keys that are less than the specified key. If the key passed as argument is present, it returns that key.*/


    /*
      3-----pollFirstEntry() and pollLastEntry() Methods-------
      pollFirstEntry() - returns and removes the entry associated with the first key of the map
      pollLastEntry() - returns and removes the entry associated with the last key of the map
    */