package chapter3.eight;

class Employee {
    int age;
    void modifyVal(int age){
        age = age + 1;
        System.out.println(age);
    }
}
class Office{
    public static void main(String args[]){
        Employee e= new Employee();
        System.out.println(e.age);     // prints 0
        e.modifyVal(e.age);;           // prints 1
        System.out.println(e.age);     // prints 0

    }
}

// The value of a primitive data type is copied and passed to a method. Hence, the variable whose value was copied does
