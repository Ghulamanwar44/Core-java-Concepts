package chapter5;
import java.util.Scanner;
public class TaskClass {
    public static void main(String args[]){

        Scanner sc= new Scanner (System.in);
        System.out.println ("Enter the number : " );
        int num = sc.nextInt();

        System.out.println ("checking whether the number is even or odd- " );
        if(num%2 == 0)
            System.out.println ("The number entered is Even!" );
        else
            System.out.println ("The number entered is Odd!" );

        System.out.println (":::::::::::::::::::::" );

        // break statement
        String[] programmers = {"Outer","Inner"};
        for(String outer: programmers){
            for(String inner: programmers){
                if(inner.equals("Inner"))
                    break;
                System.out.print (inner+":" );
            }
        }

        System.out.println ( );
        System.out.println (":::::::::::::::::::::" );

        // continue statement

        String[] programmer = {"Paul", "Shreya", "Sylvan", "Harry"};
        for (String name : programmer) {
            if (name.equals("Shreya"))
                continue;
            System.out.println(name);
        }

        // labeled statement

        String[] programs = {"Outer", "Inner"};
        outer:
        for (String outer : programs) {
            for (String inner : programs) {
                if (inner.equals("Inner"))
                    continue outer;
                System.out.print(inner + ":");
            }
        }

    }
}
