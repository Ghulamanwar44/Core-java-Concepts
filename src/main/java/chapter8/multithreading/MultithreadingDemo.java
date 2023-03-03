package chapter8.multithreading;

public class MultithreadingDemo extends Thread{

    // 1-NEW
    // 2-RUNNABLE
    // 3-RUNNING
    // 4-BLOCKED/WAITING
    // 5-TERMINATED/DEAD

    // The run method is the entry point for the thread, and it contains the code that the thread will execute.
    public void run(){
        System.out.println("Running Thread Name: "+this.currentThread().getName());
        System.out.println("Running Thread Priority: "+ this.currentThread().getPriority());
    }
}

class TestMultiThread{
    public static void main(String args[]){

        // thread-1
        MultithreadingDemo md1=new MultithreadingDemo();
        md1.setName("First Thread");
        md1.setPriority(Thread.MIN_PRIORITY);

        // thread-2
        MultithreadingDemo md2=new MultithreadingDemo();
        md2.setName("Second Thread");
        md2.setPriority(Thread.MAX_PRIORITY);

        // thread-3
        MultithreadingDemo md3=new MultithreadingDemo();
        md3.setName("Third Thread");


        md1.start();
        md2.start();
        md3.start();


    }
}
/*
-Extending the Thread class will make your class unable to extend other classes,
 because of the single inheritance feature in  JAVA. However,this will give you
 a simpler code structure. If you implement Runnable, you can gain better
 object-oriented design and consistency and also avoid the single inheritance problems.
-If you just want to achieve basic functionality of a thread you can simply implement
 Runnable interface and override run() method. But if you want to do something serious
 with thread object as it has other methods like suspend(), resume(), ..etc which are not
 available in Runnable interface then you may prefer to extend the Thread class.
* */