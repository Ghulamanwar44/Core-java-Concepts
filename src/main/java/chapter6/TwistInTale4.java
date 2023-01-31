package chapter6;

class Employee0 {
   String run(){
 System.out.println("Emp-run");
 return null;
}
}
class Programmer0 extends Employee0{
    String run() {
        System.out.println("Programmer 0-run");
        return null;
    }
}
class TwistInTale4 {
    public static void main(String args[]) {
        new Programmer0().run();
    }
}