// Java program to illustrate
// Instance Initialization Block
// with super()

package chapter3;

// Parent Class
class B {
    B() { System.out.println("B-Constructor Called"); }

    {
        System.out.println("B-IIB block");
    }
}

// Child class
class A extends B {
    A()
    {
        //super();
        System.out.println("A-Constructor Called");
    }
    // Instance Initializer block is used to initialize the instance data member
    {
        System.out.println("A-IIB block");
    }

    // main function
    public static void main(String[] args)
    {
        A a = new A();
    }
}

/* --------ORDER OF EXECUTION-------
1--Instance Initialization Block of the superclass.
2--Constructors of the superclass.
3--Instance Initialization Blocks of the subclass.
4---Constructors of the subclass.

Important points:

Instance Initialization Blocks run every time a new instance is created.
Initialization Blocks run in the order they appear in the program
The Instance Initialization Block is invoked after the parent class constructor is invoked (i.e. after super() constructor call)
*
*
* */