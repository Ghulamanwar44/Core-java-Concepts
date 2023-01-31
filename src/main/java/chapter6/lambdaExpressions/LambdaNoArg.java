package chapter6.lambdaExpressions;
interface Sayable2{
    public String say();
}

public class LambdaNoArg {
    public static void main(String args[]){
        Sayable2 s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
