package org.certification;

public class RuntimeExceptionDemo {
        public static void main(String[] args){
            System.out.println("First line");
            System.out.println("Second line");
            System.out.println("Third line");
            int[] myIntArray = new int[]{1, 2, 3};
            try{
            print4hItemInArray(myIntArray);
            }catch(Exception e){
                System.out.println ("Exception found and handled!" );
            }
            System.out.println("Fourth line");
            System.out.println("Fifth line");

        }

        private static void print4hItemInArray(int[] arr) {
            System.out.println(arr[3]);
            System.out.println("Fourth element successfully displayed!");
        }
    }
