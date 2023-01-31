package chapter3;

public class ScopeOfVariables {
    public static void main(String args[])
    {
        ScopeOfVariables obj = new ScopeOfVariables();
         obj.isPrime(6);


    }
    void isPrime(int num) {
        if (num <= 1){
            System.out.println(false);
            return;
        }
        boolean result = true;
        for (int ctr = num-1; ctr > 1; ctr--) {
            if (num%ctr == 0)
                result = false;
        }
        System.out.println(result);
    }
}
