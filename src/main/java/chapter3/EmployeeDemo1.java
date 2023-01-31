package chapter3;

public class EmployeeDemo1 {

    // constructor
     EmployeeDemo1()
    {
        System.out.println("Employee:Constructor");
    }
    // initializer block
    {
        System.out.println("Employee:initializer");
        // executes before constructor
    }
}
// initializer block can't accept method parameters
