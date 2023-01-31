package task.TaskPractice;
import java.util.Scanner;

public class SumOfFirstNatNums {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter the number: " );
        int num = sc.nextInt ();

        int sum=0;
        for (int i=1; i<=num; i++){
            sum += i;  // sum = sum+i
        }
        System.out.println ("The sum of first "+num+" natural numbers is = "+sum );
    }
}
