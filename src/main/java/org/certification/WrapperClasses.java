package org.certification;

public class WrapperClasses {
    public static void main (String args[]){

        // The wrapper classes are used to wrap primitives in an object, so they can be added to a collection object.
        // All the wrapper classes are immutable—classes that don’t allow changes to the state of their instances after initialization.

        // Three ways to create objects of the wrapper classes
        // 1- Assignment- Autoboxing )

        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

        // Autoboxing: Converting primitives into objects
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;
        // printing direct autoboxed without referring to primitives
        System.out.println("--------autoboxed without referring to primitives");
        System.out.println(bool1);
        System.out.println(char1);
        System.out.println(byte1);
        System.out.println(double1);

        // Printing objects
        System.out.println("---------Printing object values--(autoboxed from primitives)");
        System.out.println("Byte object: "+byteobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Boolean object: "+boolobj);


        // Unboxing: converting objects back into primitive types
         byte bp=byteobj;
         char cp=charobj;
         int ip=intobj;
         long lp=longobj;
         float fp=floatobj;
         double dp=doubleobj;
         boolean boolpri=boolobj;
         short sp=shortobj;

      // Printing primitives
        System.out.println("-----------Printing primitive values---------");
        System.out.println("byte value: "+bp);
        System.out.println("short value: "+sp);
        System.out.println("int value: "+ip);
        System.out.println("long value: "+lp);
        System.out.println("float value: "+fp);
        System.out.println("double value: "+dp);
        System.out.println("char value: "+cp);
        System.out.println("boolean value: "+boolpri);



        // 2- Constructor

        System.out.println("----------Creating objects via constructor-----------");

        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('a');
        Byte byte2 = new Byte((byte)10);
        Double double2 = new Double(10.98);
        //Character char3 = new Character("a");
        Boolean bool3 = new Boolean("true");
        Byte byte3 = new Byte("10");
        Double double3 = new Double("10.98");
        System.out.println(bool2);
        System.out.println(char2);
        System.out.println(byte2);
        System.out.println(double2);
        System.out.println(bool3);
        System.out.println(byte3);
        System.out.println(double3);


        System.out.println("------- 3- Static methods like valueOf() ----------");
        // 3- Static methods like valueOf()

        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf(true);
        Boolean bool6 = Boolean.valueOf("TrUE");
        Double double4 = Double.valueOf(10);
        System.out.println(bool4);
        System.out.println(bool5);
        System.out.println(bool6);
        System.out.println(double4);


            //Declaring String variable
               String str="200";
           //Converting String into int using Integer.parseInt()
              int var=Integer.parseInt(str);
           //Printing value of i
              System.out.println(var+100);


        // Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects

        int a=20;
        Integer objInt=Integer.valueOf(a);   // converting int into Integer explicitly
        Integer j=a;     // autoboxing, now compiler will write Integer.valueOf(a) internally
        System.out.println(a+" "+objInt+" "+j);

        // Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.

        Integer objRef1= new Integer(5);
        int priRef1=objRef1.intValue(); // Converting Integer to int Explicitly
        int priRef2=objRef1;  // unboxing, now compiler will write x.intValue() internally


        /*
        * Cached instances exist for the wrapper Boolean class for the values
        * true and false. The Character class caches instances with values from 0 to
        * 127. Classes Byte, Short, Integer, and Long cache instances for values -127 to
        * 128. No cached instances exist for the Float and Double wrapper classes.
        * */


    }
}
