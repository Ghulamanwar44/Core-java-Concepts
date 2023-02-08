package collectionsFramework.Map;


import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String args[]) {

        // It uses the hashcode() method for finding the position of the elements.
        // A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
        // no null key or value allowed

        // Creating Hashtable of objects
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");


        for(Map.Entry<Integer,String> m : hm.entrySet() ){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // Remove value for key 102
        hm.remove(102);
        System.out.println("After remove: "+ hm);

        //
        System.out.println("Value at key 100: "+hm.get(100));


    }}
