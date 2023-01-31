package chapter4;


public class CreatingStringObjects {
    public static void main(String args[]){

        String str1=new String("Paul");
        String str2=new String("Paul");

        System.out.println (str1 == str2 ); // prints false

        String str3="Harry";
        String str4="Harry";

        System.out.println (str3 == str4 ); // prints true

        String morning="morning";
        System.out.println ("morning"==morning );

        StringBuilder sd1 = new StringBuilder("String Builder");
        String str5 = new String(sd1);
        StringBuffer sb2 = new StringBuffer("String Buffer");
        String str6 = new String(sb2);
        System.out.println (str5+" " + str6);


        String girl = new String("Shreya"); //  String constructor that accepts a string
        char[] name = new char[]{'P','a','u','l'};
        String boy = new String(name);  // string constructor that accepts a char array


        String summer = new String("Summer");
        String summer2 = "Summer";

        System.out.println ("Summer" == summer2);
        System.out.println ("autumn" );
        System.out.println ("autumn" == "Summer" );
        String autumn = new String("Summer");
    }
}
