package task.TaskPractice;
import java.util.Scanner;
public class TableOfNumber {

    public static void main (String args[]) {
        // table of a number
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter the number: " );
        int num2 = sc.nextInt ( );

        System.out.println (":::::::::::Table of a number ::::::::::" );
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = num2 * i;     // System.out.println (num2*i );
            System.out.println ( i + "*" + num2 + " = " + table );
        }
    }
}