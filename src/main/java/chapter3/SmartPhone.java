package chapter3;

public class SmartPhone {

    // instance variables that store the state of an object of SmartPhone
    //String model;
    //String company;
   private double weight;

   public void setWeight(double val)
   {
       if(val >= 0 && val <= 1000){
           weight = val;
       }
   }
   // methods
   public double getWeight(){
       return weight;
   }

}
