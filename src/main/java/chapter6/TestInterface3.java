package chapter6;

interface Printable {
    void print();

    // Java 8 Default Method in Interface
    default void msg(){
        System.out.println("default method in Interface Java 8 Kamal! ");
    }

    //  Java 8 Static Method in Interface
    static int cube(int x){
        return x*x*x;
    }
}

interface Showable extends Printable {
    void show();
}

class TestInterface4 implements Showable{
    public void print(){
        System.out.println("print from Printable");
    }
    public void show(){
        System.out.println("Show from Showable");
    }
}

public class TestInterface3 {

    public static void main(String args[]){
        TestInterface4 test4obj =new TestInterface4();
        test4obj.print ();
        test4obj.show();
        test4obj.msg();
        System.out.println(Printable.cube(10));
    }
}

