package chapter5;

import java.util.ArrayList;

public class  DemonstrateFor {

    //  A for loop is usually used to execute a set of statements a fixed number of times. It takes the following form:
    public static void main(String args[]) {

        int ctr = 12;
        for (int j = 10, k = 14;
             j <= k;
             ++j, k = k - 1, ctr--) {
            System.out.println ( j + ":" + k + ":" + ctr );
        }

        // initialization block -(executes only once)
        int tableOf = 25;
        for (int ct = 1, num = 100000; ct <= 5; ++ct) {
            System.out.println ( tableOf * ct );
            System.out.println ( num * ct );
        }

        System.out.println ( "-----The update clause----" );

        String line = "ab";

        for (int i = 0; i < line.length ( ); ++i, printMethod ( ))
            System.out.println ( line.charAt ( i )
            );


        // optional parts of a for statement
        // System.out.println (1 );  // valid without any code in the initialisation block - (";" - semicolon is must here)


        // Nested for loop
        // hours-minutes of a clock

        for (int hrs = 1; hrs <= 6; hrs++)
            for (int min = 1; min <= 60; min++) {
                System.out.println ( hrs + ":" + min );
            }


        int multiArr[][];
        multiArr = new int[2][3];
        for (int i = 1; i < multiArr.length; i++) {
            for (int j = 1; j < multiArr[i].length; j++) {
                System.out.println ( multiArr[i][j] + " " );
            }
        }

        // Enhanced for loop (for-each loop)

        ArrayList<String> myArrayList = new ArrayList<> ( );
        myArrayList.add ( "Java" );
        myArrayList.add ( "Loop" );

        for (String elements : myArrayList) {
            System.out.println ( elements );
        }


        ArrayList<String> exams = new ArrayList<> ( );
        exams.add ( "Java" );
        exams.add ( "Oracle" );
        ArrayList<String> levels = new ArrayList<> ( );
        levels.add ( "Basic" );
        levels.add ( "Advanced" );
        ArrayList<String> grades = new ArrayList<> ( );
        grades.add ( "Pass" );
        grades.add ( "Fail" );

        ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<ArrayList<String>> ( );
        nestedArrayList.add ( exams );
        nestedArrayList.add ( levels );
        nestedArrayList.add ( grades );

        for (ArrayList<String> nestedList : nestedArrayList) {
            for (String element : nestedList)
                System.out.println ( element );
        }

        int total = 0;
        int primeNums[] = {2, 3, 7, 11};
        for (int num : primeNums) {
            total += num;
        }
        System.out.println ( total );

        StringBuilder myArr[] =
                {
                        new StringBuilder ( "Java" ),
                        new StringBuilder ( "Loop" )
                };
        for (StringBuilder val : myArr)
            System.out.println ( val );
        for (StringBuilder val : myArr)
            val.append ( "Oracle" );
        for (StringBuilder val : myArr)
            System.out.println ( val );

        // nested enhanced for loop

        ArrayList<String> exam = new ArrayList<String> ( );
        exam.add ( "Java" );
        exam.add ( "Oracle" );
        ArrayList<String> level = new ArrayList<> ( );
        level.add ( "Basic" );
        level.add ( "Advanced" );
        ArrayList<String> grade = new ArrayList<> ( );
        grade.add ( "Pass" );
        grade.add ( "Fail" );

        for (String e : exam)
            for (String l : level)
                for (String g : grade)
                    System.out.println ( e + ":" + l + ":" + g );



        int[] myArray = new int[5];
        for(int i = 0; i < myArray.length; ++i){
            myArray[i] =i;
            if(myArray[i]%2 == 0)
                myArray[i]=20;
        }
        for(int ele: myArray){
            System.out.println (ele );
        }
    }
   private static void  printMethod()
    {
        System.out.println ("Happy" );
    }
}
