package chapter7.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowDemo {
    // The Java throw keyword is used to throw an exception explicitly
    // We can throw either checked or unchecked exceptions in Java by throw keyword.

    public static void main(String args[]){
        ThrowDemo td=new ThrowDemo();
       ThrowDemo.validate(20); // calling the function
        td.validate(19);      // calling the static function via class's object
        System.out.println("rest of the code......");
    }
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote!");
        }
    }


}

class TestThrow2{
    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("D:\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }

    public static void main(String args[]){
        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code.....");
    }
}