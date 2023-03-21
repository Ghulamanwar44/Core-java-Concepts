package chapter8.multithreading.basics;

public class WhatIsThread {
    // A thread in Java simply represents a single independent path of execution of a group of statements. It is the flow of execution, from beginning to end, of a task.
   // Start() invokes the run() method on the Thread object.

}
// Two ways to create thread  1-by extending -Thread class

class Main extends Thread{

    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
            // If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
        public static void main(String args[]){
        Main main=new Main();
          //  System.out.println("This code is running outside the thread");

            int sum=0;
            int i;
            for( i=0; i<5; i++){
               sum+= sum+i++;
                Main object =new Main();
                // start() is replaced with run() for seeing the purpose of start
                object.start();
            }

    }
}

// 2-by implementing Runnable interface
class Main2 implements Runnable{
    public void run(){
        System.out.println("this code is running in a thread");
        // If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:
    }
    public static void main(String args[]){
        Main2 main2=new Main2();
        Thread thread=new Thread(main2);
        thread.start();
        System.out.println("This code is running outside the thread");
    }

}
