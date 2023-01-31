package chapter4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    /*
    * It implements the interface List.
    ■ It allows null values to be added to it.
    ■ It implements all list operations (add, modify, and delete values).
    ■ It allows duplicate values to be added to it.
    ■ It maintains its insertion order.
    ■ You can use either Iterator or ListIterator to iterate over the items of an
    ArrayList.
    ■ It supports generics, making it type safe. (You have to declare the type of the
    elements that should be added to an ArrayList with its declaration.)
    * */
    public static void main(String args[]) {

        ArrayList<String> ejg = new ArrayList<> ( ); // line 4
        ejg.add ( "One" ); // line 5
        ejg.add ( "Two" ); // line 6
        System.out.println ( ejg.contains ( new String ( "One" ) ) ); // line 7
        System.out.println ( ejg.indexOf ( "Two" ) ); // line 8
        ejg.clear ( ); // line 9
        System.out.println ( ejg ); // line 10


       // System.out.println ( ejg.get ( 0) ); // line 11 throws exception because the list is empty now


        ArrayList<String> myArrayList = new ArrayList<String> ( ); // Constructs an empty list with an initial capacity of ten.

        // adding elements to an array
        myArrayList.add ( "One" );
        myArrayList.add ( "Two" );
        myArrayList.add ( "Four" );
        myArrayList.add ( 2, "Three" );

        // using enhanced for-loop for retrieving data of a list
        for (String element : myArrayList) {
            System.out.print ( element + "\n" );
        }

        //how to use a ListIterator to loop through all the values of an ArrayList:
        ListIterator<String> iterator = myArrayList.listIterator ( ); // Get the iterator
        while (iterator.hasNext ( )) {    // Use hasNext() to check whether more elements exist
            System.out.println ( iterator.next ( ) );     // call next() to get the next item from iterator
        }


    }}

