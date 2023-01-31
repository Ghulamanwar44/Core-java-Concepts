package chapter6.lambdaExpressions;

interface Addable{
    //String say(String message);
    int add(int a , int b);
}

interface Sayable3{
    String say(String message);
}
public class LambdaExpressionMultipleArgs {
    public static void main(String args[]){

        // Multiple parameters in lambda expressions
        Sayable3 say3 = (message)->{
            String str1 = "I would like to say, ";
            String str2 = str1+message;
            return str2;
        };
        System.out.println (say3.say("time is precious") );

        Addable ad1 = (a,b) ->(a+b);
        System.out.println (ad1.add(10,20) );

        // Multiple parameters with data type in lambda expression (Lambda expression without return keyword.)
        Addable ad2 = (int a, int b) ->(a+b);
        System.out.println (ad2.add ( 100,200 ) );

        // Lambda expressions with return keyword
        Addable ad3 = (a,b) -> {
            return a+b;
        };
        System.out.println (ad3.add(5,20) );
    }
}
