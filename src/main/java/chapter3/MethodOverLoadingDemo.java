package chapter3;

public class MethodOverLoadingDemo {

    double calcAverage(int marks1, double  marks2)
    {
        return (marks1+marks2)/2.0;
    }
    // same method with three params
    double calcAverage(int marks1,int marks2, int marks3)
    {
        return (marks1+marks2+marks3)/3.0;
    }

}
