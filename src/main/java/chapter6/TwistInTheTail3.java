package chapter6;

class Employee2 {
    String name = "Emp";
    String address = "EmpAddress";
}
class Programmer2 extends Employee2{
    String name = "Prog";
    void printValues() {
        System.out.print(this.name + ":");
        System.out.print(this.address + ":"); // This approach is acceptable only if the same member isn’t defined in the derived class, that is, if there are no name collisions.
        System.out.print(super.name + ":");
        System.out.print(super.address);
    }
}
class TwistInTale3 {
    public static void main(String args[]) {
        new Programmer2().printValues();
    }
}