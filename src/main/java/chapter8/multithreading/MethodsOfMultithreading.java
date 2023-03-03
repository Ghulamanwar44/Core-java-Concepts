package chapter8.multithreading;

public class MethodsOfMultithreading {

    // yield()- stops the current executing thread & give a chance to other threads to execute

}



class Multi3 implements Runnable{
    public void run(){
        System.out.println("Now the thread is running...");
    }

    public static void main(String args[]){
        Runnable m1=new Multi3();
        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(m1, "My new thread");
        th1.start();

        // getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}
