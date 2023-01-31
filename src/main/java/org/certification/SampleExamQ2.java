package org.certification;

public class SampleExamQ2 {
    public static void main(String[]args)
    {
        int myChar = 97;
        int yourChar = 98;
        System.out.println((char)myChar + (char)yourChar);

        int age = 20;
        System.out.println(" ");
        System.out.println((float)age);

        char a = 'a';
        // char b = -10; -> error
        char c = '1';
        // integer d = 10000; -> error
        // System.out.println(++a + b++ * c - d); error

        int ctr = 50;
        ++ctr; // also same ctr += 1;
        System.out.println(ctr % 20); // 11
    }
}
