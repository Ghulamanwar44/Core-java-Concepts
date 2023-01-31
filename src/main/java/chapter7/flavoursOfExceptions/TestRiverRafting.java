package chapter7.flavoursOfExceptions;
import java.io.*;

class FallInRiverException extends Exception{}
class DropOarException extends Exception{}

class RiverRafting {
    void crossRapid (int degree) throws FallInRiverException {
        System.out.println ( "Cross Rapid" );
        if ( degree > 10 ) throw new FallInRiverException ( );
    }

    void rowRaft (String state) throws DropOarException {
        System.out.println ( "Row Raft" );
        if ( state.equals ( "nervous" ) ) throw new DropOarException ( );
    }
}

// class Handle

 class Handle {
    public static void main(String args[]){
        RiverRafting riverRafting = new RiverRafting ();
        try{
            riverRafting.crossRapid ( 11 );
        }catch(FallInRiverException e){
            System.out.println ("Exception : " + e );
        }
    }
}

// class Declare
class Declare{
    public static void main(String args[]) throws FallInRiverException{
        RiverRafting riverRafting = new RiverRafting ();
        riverRafting.crossRapid ( 11 );
    }
}

// class HandleAndDeclare
class HandleAndDeclare{
    public static void main(String args[])throws FallInRiverException{
        RiverRafting riverRafting = new RiverRafting();
        try{
            riverRafting.crossRapid(11);
        }catch(FallInRiverException fe){
            System.out.println ("Exception  : "+fe );
        }
    }
}


public class TestRiverRafting {
    public static void main (String args[])  {


        RiverRafting riverRafting = new RiverRafting ( );
        try {
            riverRafting.crossRapid ( 5 );
            //System.out.println ("Enjoy River Rafting" );
            riverRafting.rowRaft ( "nervous" );
            System.out.println ( "Enjoy River Rafting" );

        } catch ( FallInRiverException e1 ) {

            System.out.println ( "Get back in the raft" );
        } catch ( DropOarException e2 ) {
            System.out.println ( "Do not panic" );
        } finally {
            System.out.println ( "Pay for the sport" );
        }
        System.out.println ( "After the try block" );


        System.out.println(":::::::::::::::::::::::::::::::::");

    FileInputStream fis = null;
        try

    {
        fis = new FileInputStream ( "file.txt" );
        System.out.println ( "File Opened" );
        fis.read ( );
        System.out.println ( "Read File " );
    } catch(
    FileNotFoundException fnfe)

    {
        System.out.println ( "File not found" );
    } catch(
    IOException ioe)

    {
        System.out.println ( "I/O Exception" );
    } finally

    {
        System.out.println ( "finally" );
        //code to close fis
    }


}
}
