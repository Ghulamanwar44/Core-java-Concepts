package chapter8.collectionsFramework.List;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[]) {

        // -It is based on Last-In-First-Out (LIFO)
        // -We can perform push, pop, peek and search operation
        //  on the stack. The Java Stack class provides mainly five methods
        //  to perform these operations. Along with this,
        // it also provides all the methods of the Java Vector class.

        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);


        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        // Access element from the top
        String str = animals.peek();
        System.out.println("Element at top: " + str);


        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);


        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);

        Deque<Character> stackAsDeque = new ArrayDeque<Character>();
        stackAsDeque.push('A');
        stackAsDeque.push('B');
        System.out.println(stackAsDeque.peek());
        System.out.println(stackAsDeque.pop());


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(new ArrayList<>(stack)); // prints 1, 2, 3


        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(new ArrayList<>(deque)); // prints 3, 2, 1

    }
}
/*
*
-Method	    	  -Method Description
empty()   		    The method checks the stack is empty or not.
push(E item)		The method pushes (insert) an element onto the top of the stack.
pop()		        The method removes an element from the top of the stack and returns the same element as the value of that function.
peek()	    	    The method looks at the top element of the stack without removing it.
search(Object o)    The method searches the specified object and returns the position of the object.
*
*
*
*
* */