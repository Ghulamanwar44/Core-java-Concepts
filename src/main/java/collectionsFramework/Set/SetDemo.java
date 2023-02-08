package collectionsFramework.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void  main(String args[]){

        // It is an unordered collection of objects in which duplicate values cannot be stored.
        // Strictly speaking, a set cannot have duplicate values.
        // To perform the intersection between two sets, we use the retainAll() method.

        // Create set1
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        // Create set2
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);


        // --------Union ---------
        numbers.addAll(evenNumbers);
        System.out.println("Union is: "+numbers);


        // ------Intersection -----

        numbers.retainAll(evenNumbers);
        System.out.println("Intersection is: " + numbers);






        Set s= new HashSet();
        s.add(100);




    }
}
