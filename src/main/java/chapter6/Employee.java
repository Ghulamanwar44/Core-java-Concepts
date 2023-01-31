package chapter6;

public class Employee {
    static void defaultPlan(){
        System.out.println ("Basic" );
    }
}

class Programer extends Employee {}
class Project2{
    public static void main(String args[]){
        Employee emp = new Programer ();
        emp.defaultPlan();
        Employee emp2=new Programer ();
        emp2.defaultPlan();
        Programmer pgr = new Programmer();
     //  pgr.defaultPlan();
    }
}
