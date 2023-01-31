package chapter4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArrayDemo {
    public static void main (String[] args) {

        int[] arr = new int[5];
        byte b = 4; char c = 'c'; long longVar = 10;
        arr[0] = b;
        arr[1] = c;
        arr[3] = (int) longVar;
        System.out.println(arr[0]+ arr[1]+ arr[2] + arr[3]);

        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};
        arr1 = arr2;
       // arr1=arr3;
        System.out.println(arr1[0] + ":" + arr1[1]) ;


        String[] strArray;
        strArray = new String[2*5];

        // sorting an array

        int[] arrayVal={1,3,1,4,2,5,0,7,6,9,8};
        //System.out.println ( Arrays.toString ( arrayVal ));
        System.out.println("array before sorting: ");
        for(int i=0; i<arrayVal.length; i++){
            System.out.print (arrayVal[i] +" " );
        }

        Arrays.sort(arrayVal);
        System.out.println ("\narray after sorting: " );
        for(int i=0; i<arrayVal.length; i++){
            System.out.print (arrayVal[i]+" " );
        }
        //System.out.println ( Arrays.toString ( arrayVal ));
    }
}
