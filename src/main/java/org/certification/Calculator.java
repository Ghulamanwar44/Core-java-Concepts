package org.certification;

import java.util.Scanner;

public class Calculator {
    public static void main (String args[]) {


        int num1 = 0;
        int num2 = 0;



        Scanner sc = null;
        try {
            sc = new Scanner ( System.in );

        System.out.println ( "Enter First number: " );
        num1 = sc.nextInt ( );
         }catch ( Exception e ) {
            System.out.println ( e );
        }
        int sum = num1 + num2;
        int div = num1 / num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        System.out.println ( "Enter second number: " );
        num2 = sc.nextInt ( );




        System.out.println ( "Enter any of the following to perform the required operation: \n+ - * /" );

      String symbol = null;
        try {
            symbol = sc.next ( );
        } catch ( Exception e ) {
            System.out.println ( e );
        }

        String symbol1 = "sum+";
        String symbol2 = "min-";
        String symbol3 = "mul*";
        String symbol4 = "div/";

        try {
            if ( symbol.equals ( "+" ) ) {
                System.out.println ( "Addition of  " + num1 + " and " + num2 + " = " + sum );
            }
        } catch ( Exception e ) {
            System.out.println ( "Invalid Input!" + e );
        }

        try {
            if ( symbol.equals ( "-" ) ) {
                System.out.println ( "Subtraction of " + num1 + " and " + num2 + " = " + sub );
            }
        } catch ( Exception e ) {
            System.out.println ( "Invalid Input!" + e );
        }

        try {
            if ( symbol.equals ( "*" ) ) {
                System.out.println ( "Multiplication of " + num1 + " and " + num2 + " = " + mul );
            }
        } catch ( Exception e ) {
            System.out.println ( "Invalid Input!" + e );
        }

        try {
            if ( symbol.equals ( "/" ) ) {
                System.out.println ( "Division of " + num1 + " and " + num2 + " = " + div );
            }
        } catch ( Exception e ) {
            System.out.println ( "Invalid Input!" + e );
        }

    }
}
// 1- Exception handling
//
