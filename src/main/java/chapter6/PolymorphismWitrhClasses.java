package chapter6;

abstract class Employee4 {
    public void reachedOffice(){
        System.out.println ("reached office - Gurgaon , India" );
    }
    public abstract void startProjectWork();
}

class Programmer4 extends Employee4{
    public void startProjectWork(){
        defineClasses();
        unitTestCode();
    }
    private void defineClasses(){
        System.out.println ("define classes" );
    }
    private void unitTestCode(){
        System.out.println ("unit test code" );
    }
}

class Manager4 extends Employee4{
    public void startProjectWork(){
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }
    private void meetingWithCustomer() {
        System.out.println("meet Customer");
    }
    private void defineProjectSchedule() {
        System.out.println("Project Schedule");
    }
    private void assignRespToTeam() {
        System.out.println("team work starts");
    }


}

public class PolymorphismWitrhClasses{
    public static void main(String args[]){
        Employee4 emp1 = new Programmer4();
        Employee4 emp2 = new Manager4();
        emp1.reachedOffice ();
        emp2.reachedOffice ();
        emp1.startProjectWork ();
        emp2.startProjectWork();
    }
}
