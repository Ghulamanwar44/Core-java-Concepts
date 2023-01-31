package chapter3;

public class HomeEncapsulation {

    public static void main(String args[]){
        SmartPhone sp=new SmartPhone();

        sp.setWeight(-12.50);
        System.out.println(sp.getWeight());

        sp.setWeight(5064.23);
        System.out.println(sp.getWeight());

        sp.setWeight(315.87);
        System.out.println(sp.getWeight());
    }
}
