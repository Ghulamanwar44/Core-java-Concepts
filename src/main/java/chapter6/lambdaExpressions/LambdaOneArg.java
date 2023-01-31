package chapter6.lambdaExpressions;

interface Sayable{
    public String say(String name);
}
class LambdaOneArg {
    public static void main(String[] args) {
        //int width=10;

        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello"+name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello"+name;
        };
        s2.say("Monoo");
        System.out.println(s2.say("Sonoo"));



    }
}
