package chapter6;

class Student{

    String name;
    int id;
    int age;

    public void printStudentInfo(){
        System.out.println ("Name of Students is : "+this.name );
        System.out.println ("ID of Student is : "+this.id );
        System.out.println ("Age of Student is : "+age );
    }

}
public class OOPS {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name = "Aman";
        s1.id=102;
        s1.age=25;
        s1.printStudentInfo ();
    }
}
