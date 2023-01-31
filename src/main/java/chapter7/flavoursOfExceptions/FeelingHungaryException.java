package chapter7.flavoursOfExceptions;

import java.time.LocalTime;


// Using a method that throws a runtime exception
public class FeelingHungaryException extends RuntimeException{}
    class Trip{
    void goTrekking(LocalTime startTime ){
        // compare time now and start
        // throw FeelingHungaryException if difference is > 2hrs
        int hrs = LocalTime.now().getHour() - startTime.getHour ();
        if(hrs > 2) throw new FeelingHungaryException();
    }
}

class InvalidArrayAccess{
    public static void main(String args[]){String[] students = {"Shreya","Yousuf"};
        int len = students.length;
        int i=0;


        while(true) {
            if (i >= 0 && i < len)
                System.out.println(students[i]);
            i++;

            if(i>=len)
            break;
        }
        try{
            System.out.println (students[5] ); // exception thrown: ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Exception" );
        }
        System.out.println ("All seems to be well" );
        }
}

class TestTrip {
    public static void main(String args[]) {
        Trip trip = new Trip();
        trip.goTrekking(LocalTime.of(11, 24));
        System.out.println();
    }
}