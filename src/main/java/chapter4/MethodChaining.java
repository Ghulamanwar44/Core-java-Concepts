package chapter4;

public class MethodChaining {
    public static void main(String args[]){

        String morning2=new String("Morning");
        String str="Morning";

        System.out.println ("Morning" == morning2 );
        System.out.println ("Morning" == str );

        String result = "sunday ".replace(' ','Z').trim().concat("M n");
        System.out.println (result );

        String day = "SunDday";
        day.replace('D','Z').substring(3);
        System.out.println (day );   // prints: SunDday (String day remains constant)

        day = day.replace('D','Z').substring(3);
        System.out.println (day );  //  You can, of course, reassign a value to a reference variable of type String.

        String q="ABCAB";
        System.out.println (q.substring(0,2).startsWith("A") ); // compilation error if 'A'
    }
}
