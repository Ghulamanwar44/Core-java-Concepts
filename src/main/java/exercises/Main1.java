package exercises;

interface BaseInterface1 {
    default void getName() { System.out.println("Base 1"); }
}
interface BaseInterface2 {
    default void getName() { System.out.println("Base 2"); }
}
interface MyInterface extends BaseInterface1, BaseInterface2 {
    default void getName() {
        BaseInterface1.super.getName();
        BaseInterface2.super.getName();
        System.out.println("Just me");
    }
}

class JavaGuru implements MyInterface{
}



public class Main1 {
    public static void main(String[] args) {
        JavaGuru jg=new JavaGuru ();
        jg.getName ();

        Programmer p=new Programmer();
        p.accessEmployeeVariables();
        p.childMethod();



    }
}

class Programmer extends Employee {
    String name="Extended class instance variable";


    void accessEmployeeVariables() {
        super.name="hey i am super class instance variable! ";
        System.out.println (name );
        String name="Method local variable";
        this.name = "parent class instance variable";
        System.out.println(super.name);


    }
    void childMethod(){
        System.out.println(name);
    }



}
class Employee {
    String name;
}








