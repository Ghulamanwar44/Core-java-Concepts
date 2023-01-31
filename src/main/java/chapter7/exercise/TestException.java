package chapter7.exercise;

class TestFinallyBlock{
public static void main(String args[])
{
    try{
        System.out.println("Inside the try block");

        int data=25/0;
        System.out.println(data);

    }catch(ArithmeticException e){
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println(e);
    }

    finally{
        System.out.println("Finally block always executes");
    }

    System.out.println("rest of the code....");
}}

public class TestException {
}
