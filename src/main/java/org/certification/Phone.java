package org.certification;

public class Phone {

    // accessing static methods of the class
    public static String companyName="";

    public static void demo(String name)
    {
        companyName=name;
    }
}

class GFG {
    public static void main(String[] args) {

        // Accessing the static method demo() and field by class name itself
        Phone.demo("Instep Inc");
        System.out.println(Phone.companyName);

        // Accessing the static method demo() by using object's reference
        Phone obj = new Phone();
        obj.demo("Instep Incorporation team Karachi");
        System.out.println(obj.companyName);

    }
}
