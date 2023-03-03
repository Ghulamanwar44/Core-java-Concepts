package chapter8.collectionsFramework.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemoClass {
    public static void main(String args[]){
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(001,"Java-Guru");
        hashtable.put(002,"Python-Guru");
        for (Map.Entry<Integer,String> map:hashtable.entrySet()) {
            System.out.print("Key = "+map.getKey()+" "+"Value = "+map.getValue()+"\n");
        }
    }
}
