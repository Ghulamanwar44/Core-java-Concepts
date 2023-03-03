package chapter8.collectionsFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String args[]){

        // -HashSet stores the elements by using a mechanism called HASHING.
        // -HashSet contains unique elements only and single Null value.
        // -elements are inserted on the basis of their hashcode.
        // -It is backed by a hash table and provides constant-time performance for basic operations like add, remove, and contains.
        // -Time Complexity :  Insert/Add -> O(1)  , Search/Contains -> O(1) ,  Delete/Remove -> O(1)
        // -Unordered
        // -Hashset can store collections like ArrayList, LinkedList and Vector.
        // -But it will store only unique elements from these collections , no duplicates.
        // -The initial default capacity of HashSet is 16, and the load factor is 0.75.
        // USAGE -> When there is no need to keep any order in elements but group of unique objects is needed.
        // A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements

        // Creating HashSet
        HashSet<Integer> set=new HashSet<>();

        HashSet<String> hset=new HashSet<>();

        hset.add("C");
        hset.add("java");
        hset.add("Two");
        hset.add("Apple");
        hset.add("Four");
        hset.add("Six");
        hset.add("Eight");
        System.out.println(hset);

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);      // not added because no duplicate allowed in set
        set.add(null) ;
        set.add(null);  // only single null element allowed , this line null won't be added

        set.add(8);
        set.add(7);
        System.out.println(set);

        // Search - Contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain 6");
        }

        // remove - delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1 - we just deleted 1");
        }

        // Size()
        System.out.println("Size of the set after deleting 1 is ::::"+set.size());

        // Print  elements
        System.out.println(set);

        // Iterator
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // Exercise  - to check whether hashset stores duplicate elements or duplicate collections
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();

        // adding in list 1
        al1.add(10);
        al1.add(15);
        al1.add(20);

        // adding in list 2
        al2.add(10);
        al2.add(15);
        al2.add(20);

        // create Hashset
        HashSet<ArrayList> hs=new HashSet<>();

        // adding COLLECTIONS to HashSet ( if both al1 and al2 have same elements then hs will add only 1 )
        hs.add(al1);
        hs.add(al2);

        System.out.println("Size of the hashset "+hs.size());
        System.out.println("Elements inside of hashset: "+hs);

        // HashCode of hs
        System.out.println("Hashcode of hashset hs is: "+hs.hashCode());



    }
}
