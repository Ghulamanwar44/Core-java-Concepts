package chapter5;

public class DeonstrateDoWhile {

    public static void main(String args[])
    {
        int num=9;
        boolean divisibleBy7 = false;
        do{
            System.out.println (num );
            if(num % 7 == 0)
                divisibleBy7 = true;
            num--;

        }while(divisibleBy7 == false);


        int n = 10;
       while(++n>20){
           ++n;
       }
       System.out.println (n );

       //  break statement
        String[] programmers = {"Paul","Shreya","Selvan","Harry"};
        for(String name: programmers){
            if (name.equals("Shreya"))
                break;
            System.out.println (name );

        }


    }
}

