package chapter4;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String []args){
        ArrayList<String> myList= new ArrayList<>();

        System.out.println ("--------SET(int index, String element) METHOD--------------" );
        // set method
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.set ( 1,"One and Half" ); // replace element at index 1
        for(String element: myList){
            System.out.println (element );
        }

        System.out.println ("---------modifying the elements of an arrayList---------" );

        // modifying the elements of an arrayList
        ArrayList<StringBuilder> sbList = new ArrayList<>( );
        sbList.add(new StringBuilder ("One"));
        sbList.add(new StringBuilder("Two"));
        sbList.add(new StringBuilder("Three"));

        for(StringBuilder element:sbList){
            element.append(element.length()); // access arrayList elements and modify them
        }
        for(StringBuilder element:sbList){
            System.out.println (element );
        }

        System.out.println ("\n------ deleting element of an arrayList ----------\n");

        // deleting the elements of an arrayList
        ArrayList<StringBuilder> sbList2 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        sbList2.add(sb1);
        sbList2.add(sb2);
        sbList2.add(sb3);
        sbList2.add(sb4);

        sbList2.remove ( 1 );  // removes element at position 1

        for(StringBuilder element:sbList2){
            System.out.println (element+" :" );
        }
        sbList2.remove(sb3);                       // removes sb3
        sbList2.remove(new StringBuilder("Four")); // doesn't remove Four
        System.out.println ();
        for(StringBuilder element:sbList2){
            System.out.println (element );
        }

        System.out.println ("----------ADDING MULTIPLE ELEMENTS TO AN ARRAYLIST------------" );

        // ADDING MULTIPLE ELEMENTS TO AN ARRAYLIST
        // addAll(Collection<? extends E> c)
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");

        ArrayList<String> yourArrList= new ArrayList<>();
        yourArrList.add("Three");
        yourArrList.add("Four");

        myArrayList.addAll ( 1,yourArrList );

        for(String val:myArrayList){
            System.out.println (val );
        }

        // CLEARING ARRAYLIST ELEMENTS
        System.out.println (myArrayList );
        myArrayList.clear (); // clears the list
        System.out.println ( myArrayList);


        // a few methods on an ArrayList
        ArrayList<StringBuilder> l1= new ArrayList<StringBuilder>();
        StringBuilder sb=new StringBuilder("Jan");
        StringBuilder s_b2=new StringBuilder("Feb");
        StringBuilder s_b3=new StringBuilder("Mar");
        l1.add(sb);
        l1.add(s_b2);
        l1.add(s_b3);
        System.out.println (l1.contains(new StringBuilder("Jan")) );
        System.out.println(l1);
        System.out.println (l1.contains(sb) );
        System.out.println (l1.indexOf(new StringBuilder("Feb")) );
        System.out.println (l1.indexOf(s_b2) );
        System.out.println (l1.lastIndexOf ( new StringBuilder("Feb") ) );
        System.out.println (l1.get(2) + " " + l1.contains ( "Book1")+" "+ l1.indexOf ( "Book2")+" "+l1.lastIndexOf("Book1"));
        Collections.reverse (l1  );
        System.out.println (l1 );

        ArrayList<StringBuilder> list5= new ArrayList<StringBuilder>();
        ArrayList<String> list6= new ArrayList<String>();

        list6.add("Bnw");
        list6.add("Cnw");
        list6.add("Anw");
        System.out.println (list6 );
        Collections.sort(list6);
        System.out.println (list6 );
        list5.add ( new StringBuilder ( "One" ) );
        list5.add ( new StringBuilder ( "Two" ) );
        list5.add ( new StringBuilder ( "Three" ) );
        Collections.reverse ( list5 );
        // Collections.sort ( list5 );
       // Collections.sort (list5  );

        // cloning an ArrayList
        ArrayList<StringBuilder> arrayListMine= new ArrayList<>();
        StringBuilder s_b1=new StringBuilder(("Jan"));
        StringBuilder s_b4=new StringBuilder("Feb");
        arrayListMine.add(s_b1);
        arrayListMine.add(s_b4);
        System.out.println ( arrayListMine);
        ArrayList<StringBuilder> assignedArrList = arrayListMine;
        ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>)arrayListMine.clone();

        System.out.println (arrayListMine == assignedArrList );
        System.out.println (arrayListMine == clonedArrList );
        StringBuilder myArrVal = arrayListMine.get(0);
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrList.get(0);
        System.out.println (myArrVal == assignedArrVal);
        System.out.println (myArrVal == clonedArrVal );
    }
}
class Test{
    public static void main(String args[])
    {

        ArrayList<String> color_list = new ArrayList<>(4);

        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");

        System.out.println ("*****Color list******" );
        for(int i=0; i<4; i++){
            System.out.println (color_list.get ( i ) .toString ());
        }

        // create an arrayList with initial capacity of 3
        ArrayList<String> sample = new ArrayList<>(3);
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");

        // now add sample with color_list
       color_list.addAll(sample);

        // new size of the list
        System.out.println ("New size of the list is: " +color_list.size ());

        System.out.println ("*****Color list*******" );
        for(int i=0; i<7; i++){
            System.out.println (color_list.get(i).toString() );
        }

        ArrayList<String> list =new ArrayList<String>();
        Collections.addAll(color_list,"Mango","Apple");
        System.out.println ("ArrayList ELEMENTS ARE: "+color_list );
    }
}