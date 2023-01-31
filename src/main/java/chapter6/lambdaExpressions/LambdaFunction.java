package chapter6.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface StringFunction{
    String run(String str);
}
public class LambdaFunction {
    public static void main(String args[]){

        List<String> list = new ArrayList<> ();
        list.add("Ankit");
        list.add("Mayank");
        list.add("irfan");
        list.add("usman");

        list.forEach ( (n)->System.out.println(n) );

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(1);
        Consumer<Integer> method = (n) ->{
            System.out.println (n );
        };
        numbers.forEach ( method );

//        numbers.forEach((n) ->{
//            System.out.println (n );
//        });
    }
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println (result );
    }
}

// It is very useful in collection library. It helps to iterate, filter and extract data from collection.
