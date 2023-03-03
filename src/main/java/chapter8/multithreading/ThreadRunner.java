package chapter8.multithreading;

class Task1 extends Thread{
    public void run(){
        System.out.println("Task 1 Started ");
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask 1 Finito !");
    }
}

class Task2 implements Runnable{
    @Override
    public void run(){
        for(int i=11; i<=20; i++){
            System.out.print(i+" ");
        }
    }
}

public class ThreadRunner {
    public static void main(String args[]) throws InterruptedException {

        // Task1
        Task1  task1 = new Task1();
        task1.setPriority(1);
        task1.sleep(1000); // sleep for 1 sec
        task1.run();

        // Task2
        System.out.println("\nTask2 Kicked Off ") ;
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.setPriority(10);
        System.out.println("\nTask2 Finito");

        // wait for Task 1 to complete
        task1.join();

        // Task3
        System.out.println("\nTask3 Kicked Off ");
        for(int i=20; i<=30; i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask3 Finito");

    }
}
