package chapter3;


public class Student {
    // Use of this () in constructor overloading. which can be used to invoke the other constructor of the same class.

    //instance variables of the class
    int id,passingYear;
    String name,contactNo,collegeName;

    Student(String contactNo, String collegeName, int passingYear){
        this.contactNo=contactNo;
        this.collegeName=collegeName;
        this.passingYear=passingYear;
    }

    Student(int id, String name){
        this("0348932847","MUET Jamshoro",2021);
        this.id=id;
        this.name=name;
    }

     public static void main(String []args){

         System.out.println("Printing Student Information: \n");
         Student st= new Student(101,"Shakoor");
         System.out.println("Name: " + st.name + "\nId: "+st.id + "\nContact No: " + st.contactNo + "\nCollege Name: " + st.collegeName + "\nPassing Year: " + st.passingYear);

     }
}

    // Overloaded constructors must be defined using different argument lists.
    // Overloaded constructors can’t be defined by just a change in the access levels.

