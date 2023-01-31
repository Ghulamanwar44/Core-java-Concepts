package org.certification;
import java.util.Scanner;

public class FindLCMTask {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter first number: " );
        int num1=sc.nextInt();
        System.out.println ("Enter second number: " );
        int num2 = sc.nextInt();
        int lcm;

        // step-1 Find maximum number and assign it to the variable named lcm

        if(num1>num2)
          lcm =num1;
        else
            lcm=num2;

        System.out.println ("value of num1 = "+num1+"\n"+"value of num2 = "+num2+"\n"+"Greatest number is : " + lcm );


        // execute while loop until the least common multiple is not found
        while(true)
        {
            if(lcm%num1 == 0 && lcm%num2 == 0)
            {
                System.out.println ("LCM of "+num1+" and "+num2+" is = "+lcm );  // lcm = n1 or n2 if both are same numbers
                break;  // halt while loop if lcm found
            }
            ++lcm;
        }
    }
}



