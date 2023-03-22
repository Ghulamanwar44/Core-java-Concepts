package chapter8.multithreading.basics.ThreadPool;


class data {
    private static int num = 10;

    public void incNum(){
        ++num;
    }

    public int getNum (){
        return num;
    }

}

class FirstWorker implements Runnable {

    private data obj = null;

    public FirstWorker(data obj){
        this.obj = obj;
    }

    public void run(){
        System.out.printf("Within user1 thread\n");
        for(int i = 0; i < 10; i++) {
            System.out.printf("1. num -> %d\n", obj.getNum());
            obj.incNum();
            System.out.printf("1. ++num -> %d\n", obj.getNum());

        }

    }

}

class SecondWorker implements Runnable {
    private data obj = null;

    public SecondWorker(data obj){
        this.obj = obj;
    }
    public void run(){
        System.out.printf("Within user2 thread\n");

        for(int i = 0; i < 10; i++) {
            System.out.printf("2. num -> %d\n", obj.getNum());
            obj.incNum();
            System.out.printf("2. ++num -> %d\n", obj.getNum());
        }
    }
}

class ThreadProgram {
    public static void main(String[] args) {
        data obj = new data();
        FirstWorker obj1 = new FirstWorker(obj);
        SecondWorker obj2 = new SecondWorker(obj);

        Thread th1 = new Thread(obj1);
        Thread th2 = new Thread(obj2);


        //program should return output as mentioned in expected_output.txt file
        //code your solution within main() method only



        try{
            // First thread
            th1.start();
            th1.join();
            // Second thread
            th2.start();
           // th2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
