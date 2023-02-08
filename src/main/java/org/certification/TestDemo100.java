package org.certification;

public class TestDemo100{
    static void m1() {
        System.out.println("m1");
    }
    public static void main(String[] args)
    {
        System.out.println("mm");
    }
    static{
        System.out.println("sb");
        m1();
    }
}