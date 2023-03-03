package org.certification;

public class D extends Te implements A,B,C{

    // Interface A method
    public void methodA () {

        System.out.println("Interface A");
    }

    // Interface B method
    public void methodB () {

        System.out.println("Interface B");
    }

    // Interface C method
    public void methodC () {

        System.out.println("Interface C");
    }

    // class Te method
    public void methodAbs () {
        System.out.println("Class Te ");
    }

    public static void main(String args[]) {

        D d=new D();
        d.methodA();
        d.methodB();
        d.methodC();
        d.methodAbs();
    }
}
