package org.certification;

public class NumberToDigits {

    public static void main(String[]args) {

        int digit;
        int num = 20;   // int number (given number)
        int x ;          // temporary variable
        int count=2;     // the count for digit position in num
        // x=123

        while(num> 0){
            digit=num%10;
            num=num/10;
            System.out.println ("digit at place: "+(count--)+" is:" +digit);

        }
    }
}
