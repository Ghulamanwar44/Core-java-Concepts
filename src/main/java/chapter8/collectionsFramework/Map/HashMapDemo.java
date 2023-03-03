package chapter8.collectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String args[]){


         // Java HashMap contains values based on the key.
         // Java HashMap contains only unique keys.
        //  Java HashMap may have one null key and multiple null values.
        //  Java HashMap is non synchronized.
        //  Java HashMap maintains no order and is not sorted.
        //  The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
       // It provides constant-time performance for the basic operations of get and put.
       // https://javagoal.com/hashmap-method-in-java/   - HashMAap methods

       // create a hashmap
        HashMap<String, Integer> population = new HashMap<>();

        // Insertion
        population.put("China",200);
        population.put("India",130);
        population.put("America",30);
        population.put("America",35); // this updates the value only
        System.out.println(population);


        // Search
        if(population.containsKey("China")){
            System.out.println("key is Present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(population.get("China")); // gives value
        System.out.println(population.get("Indonesia")); // prints null bcz the key doesn't exist


        // Iterate over HashMap
        for(Map.Entry<String, Integer> e : population.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");

        }

        Set<String> keys=population.keySet();
        for (String key: keys)
        {
            System.out.print("\n"+key+" "+population.get(key));
        }

        // Remove entry from a map
        System.out.println("\nPopulation of world: "+population);
        population.remove("India");
        System.out.println("Population after removing India: "+population);

        // size()
        System.out.println("size of the map: "+population.size());


        System.out.println(population);
        if(population.get("China")!=null){
            System.out.println("key a has a  value");
           population.put("China",population.get("America"));
            population.put("America",null);
        }
        else
            System.out.println("empty map");

        System.out.println(population);

        System.out.println("Calling mapBully() method:: ");
        HashMapDemo obj = new HashMapDemo(); // replace MyClass with the actual name of your class
        Map<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("c", "cat");
        Map<String, String> result = obj.mapBully(map);
        System.out.println(result);


    }
    public Map<String, String> mapBully(Map<String, String> map) {
        String aValue = map.get("a");
        map.put("a", "");
        map.put("b", aValue != null ? aValue : map.get("b"));
        return map;
    }



}
