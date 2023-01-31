package chapter7.tryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryCatch {
    static FileInputStream players, coach;

    public static void main(String args[]){
        try{
            players = new FileInputStream("players.txt");
            System.out.println("coach.txt");
            try {
                coach = new FileInputStream("coach.txt");
                //.. rest of the code
            } catch (FileNotFoundException e) {
                System.out.println("coach.txt not found");
            }
            //.. rest of the code
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("players.txt not found");
        }
        finally {
            try {
                players.close();
                coach.close();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
    }
}
