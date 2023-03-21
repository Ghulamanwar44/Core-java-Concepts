package chapter8.multithreading.basics;

public class OceanTest {
}
class Task1 extends Thread {
    // overriding the run() method

    public void run() {

        System.out.println("Run method of the first class.");
        int num=1;
        int sum=0;
        while(num<=10){
            if(num%2==0){
                sum+=+num;
            }
            num++;
        }
        System.out.println("sum of first 5 even numbers is: "+sum);
    }
    public static void main(String args[]) {
        // creating object
        Task1 cc1 = new Task1();
        // cc2.start();
        cc1.start();
    }
}


 class Test {

}
