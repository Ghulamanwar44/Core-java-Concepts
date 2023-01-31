package org.certification;

public class LogicalOperators {
    public static void main(String arfs[])
    {

        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10) ; // false
        System.out.println(a > 20 || b > 10 ); // true
        System.out.println(! (b > 10));        // false
        System.out.println(! (a > 20));        // true

        System.out.println("-------------");

        int marks = 8;
        int total = 10;
        System.out.println(total < marks && ++marks > 5); // false
        System.out.println(marks);                        // 8  -> because the first condition, total < marks, evaluates to false, the next condition, ++marks > 5, isn’t even evaluated.
        System.out.println(total == 10 || ++marks >10);  // true
        System.out.println(marks);                      // 8   ->  because total == 10 evaluates to true, the second condition, ++marks > 10, isn’t evaluated.

        System.out.println("-------------");

        int var1 = 10;
        int var2 = 20;
        int var3 = 40;
        System.out.println(var1++ > 10 || ++var2 < 30);                // var1=11 , var2=21 == true
        System.out.println(var2 > 90 && ++var2 < 30);                  // false
        System.out.println(!(var3>20) && var1==10);                    // false
        System.out.println(var1 >=90 || var1 <= 33 && var2 == 10);     // false -> (var1 >= 90 || (var1 <= 33 && var2 == 10))
        System.out.println(var1 >=90 && var1 <= 33 || var2 == 10);     // false


       // The logical operator && is often used in code to check whether an object reference
       // variable has been assigned a value before invoking a method on it
        String name = "Hello";
        if(name != null && name.length() >0)
            System.out.println(name.toUpperCase());

        // operator precedence
        int int1 = 10, int2 = 20 , int3 = 30;
        System.out.println(int1 % int2);
        System.out.println(int1 % int2 * int3 + int1 / int2); // 300   --> ((int1 % int2) * int3)) + (int1 / int2)
                                                              // (10  x 30) + (10 / 20)
        System.out.println(10/20);  // 0                     //  300       + 0

    }


}

class Test100{
    public static void main(String args[]){

        try{
            System.out.println("one");
            System.exit(0);   // terminates whole program here i,e (output: one)
        }catch(Exception e){
            System.out.println("two");
        }
        finally{
            System.out.println("three");
        }
        String s1=new String("java");
        String s2=new String("java");
        String s3="java";
        String s4="java";

        System.out.println(s4==s3);

        int [] ar={1,2,3,4,5};
        System.out.println(ar[4]);


    }

}