package org.certification;

public class TwistNumberSystem {
     public static void main(String args[]){

          // Relational operators
          int i1 = 10;
          int i2 = 20;
          System.out.println(i1 == i2); // false
          System.out.println(i1 != i2); // true
          boolean b1 = false;
          System.out.println(b1 == true); // false
          System.out.println(b1 != true); // true
          System.out.println(b1 == false); // true
          System.out.println(b1 != false); // false
          System.out.println(i1 >= i2); // false
          long long1 = 10;
          long long2 = 20;
          System.out.println(long1 <= long2);  // true

          int c = 10;
          boolean bool1 = false;
          // System.out.println(c == bool1); causes compilation error (incomparable types: )

          int n=10;
          int m=20;
          System.out.println(n=m); // 20
          boolean bool2 = false;
          System.out.println(bool2 = true);
          System.out.println(bool2 = false);


          // unary decrement operator (--) in postfix notation
          double d = 20.0;
          double e = 10.0;
          double f = d * e--;
          System.out.println(e);  // 9.0
          System.out.println(f); // 200.0
          System.out.println(e); // 9.0

          int a = 10;
          a = a++ + a + a-- - a-- + ++a;
          System.out.println("a = "+a);


          int y = 10;
          y = ++y + y + --y - --y + y++;
          System.out.println("y = " + y);


          int x = 10;
          x = ++x + x + --x + x--;
          System.out.println("x = "+x);



          char c3 = (char)-122;
          System.out.println("c3 = " + c3); // compiles successfully


          char c2 = '\u0122';
        //  System.out.println("c1 = " + c1);
          System.out.println("c2 = " + c2);

          int baseDecimal = 267;
          int octalVal = 0413;
          int hexVal = 0x10B;
          int binVal = 0b100001011;
          System.out.println(baseDecimal+octalVal);
          System.out.println(hexVal+binVal);

          long var1 = 0_100_2676_760;
          System.out.println("var1: "+var1);

          //long var2 = 0_x_4_13;

          //long var3 = 0b_x10_BA_75;

          //long var4 = 0b_10000_10_11;

          //long var5  = 0xa10_AG_75;

          long var6 = 0x1_0000_10;
          System.out.println("var6: "+var6);

          long var7 = 100__12_12;
          System.out.println("var7: "+var7);
     }
}
