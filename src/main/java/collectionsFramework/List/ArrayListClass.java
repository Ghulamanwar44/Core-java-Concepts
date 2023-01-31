package collectionsFramework.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String args[]){

        // creating an arrayList
        ArrayList<String> list = new ArrayList<String>();

        list.add("Harris");
        list.add("Alee");
        list.add("Alee");
        list.add("Musa");
        list.add("Harun");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            boolean b=list.get(1)==(list.get(2));
            System.out.println(b);
        }
    }
}

