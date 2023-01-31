package chapter6;

public abstract class Vehicle {
    int no_of_tyres;
    abstract void start();
}

class Car extends Vehicle{
    int no_of_tyres=4;
    void start(){
        System.out.println ("Car starts with Key! " );
    }
}

class Bike extends Vehicle{
   int  no_of_tyres=2;
    void start(){
        System.out.println ("Bike starts with kick! " );
    }
}

class Test2{
    public static void main(String args[]){
    Car c=new Car ();
    Bike b= new Bike();

    c.start ();
    b.start();
}
}
