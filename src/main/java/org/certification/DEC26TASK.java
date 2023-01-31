package org.certification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DEC26TASK {
    public static void main (String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<> ( );
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Enter the number: " );

        while (true) {
            try{
                boolean i= arrayList.add ( sc.nextInt ( ) );
                if (i==true )
                {
                    arrayList.add ( sc.nextInt ( ) );
                }
            }
            catch
            (Exception e){
                String s;
                s = sc.next ( );
                if ( s.equals ( "e" ) )
                    break;
            }
        }
        System.out.println ("Elements of the list: "+ "\n"+arrayList );

        int min = Integer.MAX_VALUE;
        // System.out.println (min );
        for(Integer i: arrayList)
            if( min>i){
                min=i;

            }
        System.out.println ("Minimum element is: " + min );

        int max = Integer.MIN_VALUE;
        //System.out.println (max );
        for(Integer i: arrayList)
            if( max<i){
                max=i;

            }
        System.out.println ("Max element is: "+ max );



    }
}