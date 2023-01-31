package chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class JavaCollectionAddAllExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Before applying addAll() : " );
        System.out.println("Elements in queue : "+ set);
        for (int i = 1; i < 11; i++) {
            int j = i *5;
            //
            list.add(j);
        }
        System.out.println("Elements in list : "+list);
        System.out.println();
        System.out.println("After applying addAll : ");
        //will add all the elements in the set which are present in list
        set.addAll(list);
        System.out.println("Elements in queue : " + set);
        System.out.println("Elements in list : "+list);
    }
}