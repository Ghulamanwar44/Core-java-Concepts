package collectionsFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]){

        // Java LinkedHashSet class contains unique elements only like HashSet.
        // Java LinkedHashSet class provides all optional set operations and permits only one null element.
        // Java LinkedHashSet class maintains insertion order.
        // Good choice for applications where the insertion order needs to be maintained but the elements need to be unique.
        // fast lookup and insertion operation
        // -It is backed by a hash table and provides constant-time performance for basic operations like add, remove, and contains.
        // -Time Complexity :  Insert/Add -> O(1)  , Search/Contains -> O(1) ,  Delete/Remove -> O(1)
        // It uses a HashTable and doubly linked list to store and maintain the insertion order of the elements.
        // The LinkedHashSet extends the HashSet, so it uses a hashtable to store the elements. Moreover, it uses a doubly linked list to maintain the insertion order.
        // More Memory usage than HashSet hence less performance than HashSet
        // USAGE-> When group of unique elements is needed and insertion order of elements is also required.



        // Create LinkedHashSet
        LinkedHashSet<String> set=new LinkedHashSet<>();

        // Insert Elements to LinkedHashSet
        // add() ---> adds single element/object
        set.add("One");
        set.add("two");
        set.add("Three");
        set.add("Four");
        // addAll() - inserts all the elements of the specified collection to the linked hash set

        set.add(null);
        set.add(null);


        System.out.println(set);



    }
}
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
}
class LinkedHashSetExample{
    public static void main(String args[]){
        LinkedHashSet<Book> hashSet = new LinkedHashSet<>();

        // Creating books
        Book b1=new Book(101,"Let us Learn Java","Mala Gupta","PK Publishers",10);
        Book b2=new Book(102,"Data Communication and Networking","Alice","Paislys",15);
        Book b3=new Book(103,"Operating Systems","Deepak Kumar","KK publishers",50);

        // Adding books to hashset
        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);

        //Traversing HashSet
        for(Book b:hashSet){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}

//😊😊😍💕