package chapter7.exercise;

public class X {
    public static void main(String args[] ){
        try{
            badMethod();
            System.out.println("A");
        }catch(RuntimeException ex){
            System.out.println("B");
        }catch( Exception e1){
            System.out.println("C");
        }finally{
            System.out.println("D");
        }
        System.out.println("E");
    }

    public static void badMethod(){
        throw new RuntimeException();
    }
}
