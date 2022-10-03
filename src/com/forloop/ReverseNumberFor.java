package com.forloop;

import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter the number :: \n");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for( ;num != 0; num=num/10)
        {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
        }
        //for (int i = num; i != 0; i-- ) {

          //  int remainder = num % 10;
            //rev = rev * 10 + remainder;
            //num = num / 10 ;
        //}
        System.out.println("The reverse of the given number is: " + rev);

    }
}
