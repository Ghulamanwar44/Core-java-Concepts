package chapter3;

public class ConstructorDemo {
    String name;
    int id;

    ConstructorDemo(){
        System.out.println("this is default constructor");

    }

    ConstructorDemo(int i, String n){
        id=i;
        name=n;
    }
    public static void main(String args[]){
        ConstructorDemo cdObj=new ConstructorDemo( );
        System.out.println("\n default constructor values: \n");
        System.out.println("constructor demo id: "+cdObj.id+"\nConstructor Name:"+cdObj.name);

        System.out.println("\n parametrized constructor values: \n");
        ConstructorDemo cd = new ConstructorDemo(10,"Dawood");

        System.out.println("Constructor Name: "+cd.name+"\nConstructor id: "+cd.id);

    }
}
/* Overloaded constructors must be defined+ using different argument lists.
■ Overloaded constructors can’t be defined by just a change in the access levels.
■ Overloaded constructors may be defined using different access levels.
■ A constructor can call another overloaded constructor by using the keyword this.
■ A constructor can’t invoke a constructor by using its class’s name.
■ If present, the call to another constructor must be the first statement in a
constructor.
■ You can’t call multiple constructors from a constructor.
■ A constructor can’t be invoked from a method (except by instantiating a class
using the new keyword)
*/