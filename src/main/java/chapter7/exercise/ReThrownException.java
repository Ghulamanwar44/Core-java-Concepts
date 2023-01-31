package chapter7.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrownException {
FileInputStream soccer;
public void myMethod()throws FileNotFoundException{
    try{
        soccer = new FileInputStream("soccer.txt");
    }catch(FileNotFoundException fnfe){
        throw fnfe;
    }
}
}
