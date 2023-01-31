package chapter6.lambdaExpressions;

class NoMethodParameters{
    void print1To10() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
    void print10To20() {
        for (int i = 10; i <= 20; i++)
            System.out.println(i);
    }
    void print1To99() {
        for (int i = 1; i <= 99; i++)
            System.out.println(i);
    }
}


class WithMethodParameters {
    void printNumbers (int start, int end) {
        for (int i = start; i <= end; i++)
            System.out.println ( i );
    }
}

public class SimpleLambda {
    public static void main(String args[]){
        NoMethodParameters noParameters = new NoMethodParameters();
        noParameters.print10To20();
        noParameters.print1To99();
        WithMethodParameters withParameters = new WithMethodParameters();
        withParameters.printNumbers(10, 20);

        withParameters.printNumbers(1, 99);
        withParameters.printNumbers(100, 200);
        withParameters.printNumbers(500, 1000);
    }

}