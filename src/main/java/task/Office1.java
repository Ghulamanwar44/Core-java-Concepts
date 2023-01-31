package task;
class Employee {
    java.lang.String name = "Employee";
    void printName() {
        System.out.println(name);
    }
}
class Programmer extends Employee {
    java.lang.String name = "Programmer";
    void printName() {
        System.out.println(name);
    }
}

class Office1 {
    public static void main(java.lang.String[] args) {
        Employee emp = new Employee();
       Employee programmer = new Programmer();
        System.out.println(emp.name);
        System.out.println(programmer.name);
        emp.printName();
        programmer.printName();
    }
}