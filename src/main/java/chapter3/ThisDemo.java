package chapter3;

public class ThisDemo {

    // 1- this keyword is used to invoke current class instance variable
    int i;
    void setValue(int i){
        this.i=i;  // if we dont use this keyword here the compiler will print 0 because of the ambiguity between local and instance variable.


    }
    void showOutput(){
        System.out.println(i);

    }

    // 2- this keyword can be used to invoke current class method (implicitly)
    void display(){
        System.out.println("hello");
    }

    void show(){
        display(); // here, compiler implicitly adds this keyword for its current class method i,e this.display();
    }
    public static void main(String args[]){
        ThisDemo td=new ThisDemo();
        td.setValue(100);
        td.showOutput();
        td.show();
    }
}
