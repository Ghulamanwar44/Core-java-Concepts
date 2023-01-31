package org.certification;
import java.util.Scanner;

public class TaskArrayToDay {
    public static void main(String args[]){

        System.out.println("Enter day number: ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if(day>0 && day<8) {
            System.out.println("Today is: " + days[day - 1]);
        }else
            System.out.println("Invalid input!");





















//        while(day>0) {
//            if (day == 1) {
//            } else if (day == 2) {
//
//            } else if (day == 3) {
//
//            } else if (day == 4) {
//
//            } else if (day == 5) {
//
//            } else if (day == 6) {
//
//            } else if (day == 7) {
//
//            } else
//                System.out.println("Invalid input!");
//            break;
//        }






//
//    String dayofWeek="";
//
//        switch(day){
//            case 1:
//               dayofWeek=days[0];
//               break;
//            case 2: dayofWeek=days[1];
//            break;
//            case 3: dayofWeek=days[2];
//            break;
//            case 4: dayofWeek=days[3];
//            break;
//            case 5: dayofWeek=days[4];
//            break;
//            case 6: dayofWeek=days[5];
//            break;
//            case 7: dayofWeek=days[6];
//                break;
//            default:
//                System.out.println("Invalid input!");
//        }
//
//        System.out.println("Today is: "+dayofWeek);
    }
}
