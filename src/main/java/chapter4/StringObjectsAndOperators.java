package chapter4;

public class StringObjectsAndOperators {

    static int count;

    StringObjectsAndOperators(){
         count++;
        System.out.println ( "Object created and constructor called");
    }
    public static void main(String[]args){



        String lang1 = "Java";
        String lang2 = "JaScala";
        String returnValue1 = lang1.substring(0,1);
        String returnValue2 = lang2.substring(0,1);
        System.out.println (returnValue1 );
        System.out.println (returnValue2 );
        System.out.println (returnValue1 == returnValue2 );
        System.out.println (returnValue1.equals ( returnValue2 ) );


        String str = "OCJA";
        int num1 = 15;
        int val = 25;
        String anotherStr = num1 + val + str;
        System.out.println ( anotherStr); // prints : 175OCJA
        String string2 = ""+num1+val+str;
        System.out.println (string2 );

        String lang = "Java";
        lang += " is everywhere!";
        System.out.println (lang );

        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println (initializedToNull ); // prints: nullJava

        String var1 = new String("Java");
        String var2 = new String("Java");

        System.out.println (var1 == var2 );          // false
        System.out.println (var1.equals(var2) );     // true
        System.out.println (var1.equals("Java") );   // true


        String var3 = "code";
        String var4 = "code";
        System.out.println (var3.equals(var4) ); // true
        System.out.println (var3 == var4 );      // true

        String b= new String("Be");
        String b2="Be";
        System.out.println (b.equals(b2) ); // true
        System.out.println (b == b2);       // false

        String varStr1 = new String("Java");
        String  varStr2 = new String("Java");
        String varstr3 = "Java";
        System.out.println (varStr1.equals(varStr2) );
        System.out.println (varStr1 == varStr2);
        System.out.println (varStr1 != varStr2 );
        System.out.println (varStr1 == varstr3 );
        System.out.println (varStr2 == varstr3 );
    }

}
