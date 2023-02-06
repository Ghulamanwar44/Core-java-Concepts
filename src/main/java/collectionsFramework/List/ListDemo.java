package collectionsFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String args[]){

        List l =new ArrayList();

        l.add(100);
        l.add(1,200); // Index based , hence maintains insertion order
        l.add(300);
        l.add(400);

        // duplicate element
        l.add(300);

        // can contain null values
        l.add(null);
        l.add(null);

        // we can iterate over elements of a list in two ways i,e Iterator(Forward direction) and ListIterator(Forward+Backward direction)

        // 1-Iterator  ( hasNext() & next() )
        Iterator itr =l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // 2-ListIterator  ( hasNext(),hasPrevious() + next(), previous()
        ListIterator litr=l.listIterator();
        while(litr.hasNext()) {
            System.out.println(litr.next());
        }
    }
}
