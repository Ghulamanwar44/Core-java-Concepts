package chapter3;

public class MethodParams {
   public boolean sendSMS(String phNum, String msg)
   {
       boolean msgSentStatus = false;
//       if(send (phNum, msg))
//       {
//           msgSentStatus = true;
//       }
       return msgSentStatus;
   }
   double calcAverage(int marks1, int marks2)
   {
      int avg = (marks1+marks2)/2;
       System.out.println(avg);
      return avg;

   }

    public static void main(String []args)
    {
        MethodParams mpObj=new MethodParams();
        mpObj.calcAverage(10,20);
      //  System.out.println("The average of two numbers is: "+mpObj.calcAverage(20,30));


    }
}
/*RULES TO REMEMBER
Here are some points to note with respect to defining method parameters:
■ You can define multiple parameters for a method.
■ The method parameter can be a primitive type or object.
■ The method’s parameters are separated by commas.
■ Each method parameter is preceded by the name of its type. Each method
parameter must have an explicit type declared with its name. You can’t declare
the type once and then list the parameters separated by commas, as you can
for variables*/