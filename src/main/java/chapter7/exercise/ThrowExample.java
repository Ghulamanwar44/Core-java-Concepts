package chapter7.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}

class Voting{
    public static void main(String args[]){
        //YoungerAgeException obj = new YoungerAgeException();
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the polling booth! ");
        System.out.println("Enter Age : ");
        age=sc.nextInt();
        if(age<18)
        {

            throw new YoungerAgeException("You are not eligible to vote");
            // we cannot write anything below throw statement
        }else {
            System.out.println("eligible to vote!");
        }
    }
}


class ReadAndWrite{
    void readFile()throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
    void saveFile()throws FileNotFoundException{
        String text ="this is demo";
        FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
    }
}

class Test{
    public static void main(String args[]){
        ReadAndWrite rw=new ReadAndWrite();

        try{
            rw.readFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            rw.saveFile();
        }catch(FileNotFoundException e){
          e.printStackTrace();
        }
        System.out.println("hello");
    }
}

public class ThrowExample {
    public static void main(String args[]){
        ThrowExample obj=new ThrowExample();
        obj.method1();
    }
    void method1(){
        System.out.println("1");
        method2();
        System.out.println("2");
    }
    void method2(){
        System.out.println("3");
        method1();
        System.out.println("4");
    }
}
