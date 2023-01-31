package chapter7.flavoursOfExceptions;

 class AinvenEE {

        StringBuilder getStringBuilder(){
        StringBuilder returnValue = new StringBuilder("10");
        try {
            String[] students ={"Harry","Samson"};
            System.out.println(students[5]);
        }catch(Exception e){
            System.out.println("About to return :"+returnValue);
            return returnValue;
        }finally{
            returnValue.append("10");
            System.out.println("Return value is now :" + returnValue);
        }
         return  returnValue;
        }
        public static void main(String args[]) {
            AinvenEE ae= new AinvenEE();
            System.out.println("In Main: "+ae.getStringBuilder());

        }
    }

      // If a catch block returns a primitive data type, the finally block can’t modify the value being returned by it.
   // If a catch block returns an object, the finally block can modify the state of the object being returned by it.

    // If a catch block returns a primitive data type, the finally block can’t modify the value being returned by it. Here’s an example
    // If both the catch and finally blocks define return statements, the calling method will receive a value from the finally block.
public class MultipleReturn{
    public static void main(String args[]) {
        MultipleReturn mr = new MultipleReturn();
        //System.out.println(mr.getInt());

        MultipleReturn var = new MultipleReturn();
        //System.out.println("In Main:" + var.getInt());
    }
}
