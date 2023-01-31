package chapter5;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String args[]){


        int marks = 20;
        switch(marks){
            case 10:
                System.out.println (10 );
                break;
            case 20:
                System.out.println (20 );
                break;
            case 30:
                System.out.println (30 );
            default:
                System.out.println ("default" );
                break;
        }

        // checking days of a week through if-else constructs

        Scanner sc=new Scanner ( System.in );
        System.out.print ("Enter the day: ");
        String day =sc.next ();
        System.out.println (day );

        if( (day.equals("Monday")) || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday"))
        System.out.println ("Time to work" );
       else if(day.equals("Friday"))
            System.out.println ("Nearing weekend" );
        else if ( day.equals("Saturday") || day.equals ( "Sunday" ))
            System.out.println ( "Weekend!");
        else System.out.println ("Invalid" );



        // examine this implementation of the preceding code using the switch statement:

        day = null;
        System.out.println ("Enter the day again: " );
        day=sc.next ();
        System.out.println (day );
        switch(day){
            case "Mon":
            case "Tues":
            case "Wed":
            case "Thur":
                System.out.println ("Time to work");
                break;
            case "Fri":
                System.out.println ("Nearing the weekend...." );
                break;
            case "Sat":
            case "Sun":
                System.out.println ("Weekend!" );
                break;
            default:
                System.out.println ("Invalid" );

        }
        // exercise problem

        String dayy = new String ( "Sun" );
        switch(dayy){
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thur":
                System.out.println ("Time to work" );
                break;
            case "Fri":
                System.out.println ("Nearing weekend" );
                break;
            case "Sat":
            case "Sun":
                System.out.println ("Weekend" );
                break;
            default:
                System.out.println ("Invalid" );
        }

        // Arguments passed to a switch statement -- (A switch statement accepts arguments of types char, byte, short, int, and String)

        final int  a = 10, b = 20, c = 30;
        switch(a){
            case b+c:
                System.out.println (b+c );
                break;
            case 10*7:
                System.out.println (10*7665+10 );
                break;
        }


    }
}
