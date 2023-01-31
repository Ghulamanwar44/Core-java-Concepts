package chapter6.lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LambdaSample {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList ( 1,2,3,4,5,6);

        int result = 0;
        for(Integer e: numbers){
           if (e>3  && e%2 == 0){
            result += e*2;
            break;
           }
        }
        System.out.println (result );

        System.out.println (
                numbers.stream ()
                        .filter ( e -> e > 3 )
                        .filter ( e -> e % 2 ==  0)
                        .map ( e -> e * 2 )
                        .findFirst ()
        );
    }
}
