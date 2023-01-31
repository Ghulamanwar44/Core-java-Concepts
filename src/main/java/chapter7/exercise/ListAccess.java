package chapter7.exercise;

import java.util.ArrayList;
class Ink{}
interface Printable{}
class ColorInk extends Ink implements Printable{}
class BlackInk extends Ink{}

public class ListAccess {
    public static void main(String args[]){
        Printable printable =null;
        BlackInk blackInk = new BlackInk();
        printable = (Printable)blackInk;
        System.out.println(printable);

        ArrayList<Ink> inks = new ArrayList<Ink>();
        inks.add(new ColorInk());
        inks.add(new BlackInk());
        if(inks.get(0) instanceof BlackInk){
        BlackInk ink = (BlackInk)inks.get(0);
        }
    }
}
