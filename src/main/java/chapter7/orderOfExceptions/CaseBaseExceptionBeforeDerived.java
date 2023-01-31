package chapter7.orderOfExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class CaseBaseExceptionBeforeDerived {
    public static void main(String args[]){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("file.txt");
            fis.close();
        }catch(IOException ioe){
            System.out.println("IOException");
        }
//        catch(FileNotFoundException fnfe){
//            System.out.println("file not found");
//        }       -> this wont compile because FileNotFoundException is child to IOException ,
    }
}
