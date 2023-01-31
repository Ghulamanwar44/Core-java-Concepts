package chapter3;

class Phone2{
    double weight;
    double setWeight(double val) // here if we remove double and add void as a return type than compiler will give error
    {
        weight = val;
       // return val;
        return val;
    }
}
public class TestMethods
{
    public static void main(String args[]){
        Phone2 obj = new Phone2();
        double newWeight = obj.setWeight(20.22);
        System.out.println(newWeight);
    }
}
/*
  If a method doesn’t return a value, you can’t assign the result of that method to a variable.
  What do you think is the output of the following class TestMethods, which uses
  the preceding  class Phone?
*
* */
