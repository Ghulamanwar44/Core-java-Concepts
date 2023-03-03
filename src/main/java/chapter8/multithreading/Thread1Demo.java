package chapter8.multithreading;

public class Thread1Demo extends  Thread {
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        Thread1Demo t1=new Thread1Demo();
        //t1.run();
        t1.start();

        Thread1Demo t2 = new Thread1Demo();
        //t2.run();
        t2.start();
    }
}
