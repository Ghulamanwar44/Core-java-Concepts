package org.certification;

import java.util.Scanner;

public class Dec14Task {

    public static void main(String args[]){

        // finding factorial of a number

        System.out.println ("Enter a number: " );
        int num= new Scanner(System.in).nextInt ();

        int factorial=1;
        for(int i=num; i>0; i--){
            factorial = factorial *i;
        }
        System.out.println ( "Factorial of number "+num+ " is "+factorial);
    }
}
