package chapter8.multithreading;

public class DaemonThreadDemo {
    // Def: Daemon thread is a thread that runs in background of another thread
    // Use: It provides service to the threads
    // Ex: Garbage Collector, finalizer, Attach listeners, Signal dispatcher.
    // we have to use thread.setDaemon(boolean) before the thread.start to make it a Daemon-thread
}
class DaemonTest extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread");
          // System.out.println(Thread.currentThread().isDaemon()); ->  prints true
        }else
        System.out.println("child thread");
    }
    public static void main(String args[]){
      //  System.out.println("Main thread");
        DaemonTest dt=new DaemonTest();
        dt.setDaemon(true);
        dt.start();
    }
}
