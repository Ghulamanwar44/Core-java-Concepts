package org.certification;
import java.util.Scanner;

    public class NumberToWords {

        public static void main(String[] args) {
            String ones[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

            String tens[]={"twenty", "thirty","forty","fifty","sixty","seventy","eighty","ninety",};

            String hundreds[]={"Hundred","thousand"};

            System.out.print("Type a number : ");
            int number = new Scanner (System.in).nextInt();
            String numberWords = "";

            if(number<20){
                numberWords = ones[number];
            } else {
                int digitIndex = 1;
                int numPart = number % 100;
                if(numPart < 20) {
                    if(numPart > 0)
                        numberWords = ones[numPart];
                    number = number / 100;
                    digitIndex = 3;
                }
                while (number > 0){
                    numPart = number % 10;
                    switch (digitIndex) {
                        case 1:
                            if(numPart > 0)
                                numberWords = ones[numPart] + (numberWords.length() > 0 ? " " + numberWords : "");
                            break;
                        case 2:
                            numberWords = tens[numPart-2] + (numberWords.length() > 0 ? " " + numberWords : "");
                            break;
                        case 3:
                            if(numPart > 0)
                                numberWords = ones[numPart] + " " + hundreds[0] + (numberWords.length() > 0 ? " " + numberWords : "");
                            break;
                        case 4:
                            if(numPart > 0)
                                numberWords = ones[numPart] + " " + hundreds[1] + (numberWords.length() > 0 ? " " + numberWords : "");
                    }
                    number = number / 10;
                    digitIndex++;
                }
            }
            System.out.print(numberWords);
        }
    }




