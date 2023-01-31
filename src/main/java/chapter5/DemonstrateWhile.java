package chapter5;

public class DemonstrateWhile {

    // A while loop is used to repeatedly execute a set of statements as long as its condition evaluates to true
    public static void main (String args[]){

        int i=0;
        while(i<11){
            System.out.print (i+" " );
            i++;
        }
        System.out.println ( );

        int num = 9;
        boolean divisibleBY7 = true;
        while(!divisibleBY7) {
            System.out.println ( num );
            if ( num % 7 == 0 )
                divisibleBY7 = true;
            --num;
        }
    }

}
