package chapter3;

public class Office {
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
      //  e1.name=" Selvan";   won't compile bcz name has private access
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
    }
}
//Because the constructor of the class Employee assigns a value of 22 to the variable age,
//objects e1 and e2 both contain the same value, 22