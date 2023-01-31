package chapter7;

public class TwistInTaleCatchError {
    public static void main(String args[]) {
        try {
            myMethod();
        } catch (StackOverflowError s) {
            for (int i=0; i<2; ++i)
                System.out.println(i);
        }
    }
    public static void myMethod() {
        myMethod();
    }
}
 class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main obj = new Main();
        helloName("Bob");

    }
    static String helloName(String name) {
        System.out.println("in method");
        return "Hello"+name+"!";

    }

}
