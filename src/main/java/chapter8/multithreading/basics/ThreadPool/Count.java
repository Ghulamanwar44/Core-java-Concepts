package chapter8.multithreading.basics.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Count  {
   int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Count(int sum) {
    this.sum=sum;
    }
}
class One extends Thread {

    private Count count;
    public One(Count count) {
        this.count = count;
    }

    public void run()throws NullPointerException {
        System.out.println("thread name: " + Thread.currentThread().getName());
        System.out.print("sum of first 10 even numbers is: ");
        int num = 1;
        count.sum=0;
        while (num <= 20) {
            if (num % 2 == 0) {
                count.sum += +num;
            }
            num++;
        }
        System.out.println(count.sum);
    }
}

class Two extends Thread {
    private Count count;
    public Two(Count count) {
        this.count = count;
    }
    public void run() throws NullPointerException{
        System.out.println("thread name: " + Thread.currentThread().getName());
        int num = 1;
        count.sum= count.sum;
        while (num < 20) {

            if (num % 2 != 0) {
                count.sum += num;
            }
            num++;
        }
        System.out.println("sum of first ten odd numbers + first ten even numbers is : " + count.sum);
    }
}
class Test {
    public static void main(String args[]) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Count c=new Count(0);
        One one = new One(c);
        executorService.execute(one);
        Two two = new Two(c);
        executorService.execute(two);
    }
}
