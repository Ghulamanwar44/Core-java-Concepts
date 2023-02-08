package collectionsFramework.Set.SortedSet.NavigableSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main (String args[]){

        // The objects of the TreeSet class are stored in ascending order.
        // Java TreeSet class access and retrieval times are quiet fast.
        // No Null element is allowed. If we add Null it throws Exception.
        // TreeSet gives the performance of order O(log(n)) for insertion, removing, and retrieving operations.
        // Like HashSet and LinkedHashSet it also represents a group of unique elements but maintains ascending order for them.
        // When group of unique items/elements/objects is needed and sorting of the elements is required according to some Comparator.
        // By-Default, it maintains ascending order of objects. We can provide custom sorting algorithm by using Comparator.
        // Java TreeSet class is non-synchronized.


        // Creating TreeSet
        TreeSet<String> t = new TreeSet<String>();

        // Insertion
        t.add("Java");
        t.add("Spring");
        t.add("Hibernate");
        t.add("Hibernate");    // Duplicates Not added
                               // t.add(null); Throws exception

        // System.out.println(t); // print. By default elements are stored in Ascending order

        int i=1;
        String s="Element";
        // Iteration
        for(String element: t){
            System.out.print(s+" "+ i++ +" ");
            System.out.println(element);
        }



        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);


        // Using the remove() method   ( To remove all elements use removeAll() method)
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);


        // Methods for Navigation
        System.out.println("First Number: "+numbers.first());
        System.out.println("Last Number: "+numbers.last());


        // Using higher()
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(3));

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);



    }
}
