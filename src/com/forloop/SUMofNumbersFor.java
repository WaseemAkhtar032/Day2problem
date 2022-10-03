package com.forloop;

import java.util.Scanner;

public class SUMofNumbersFor {
        public static void main(String[] args) {
            int sum=0;
            System.out.println("\n Enter the number:: \n ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            for(int i = num; i > 0 ; i--) {
                sum = i + sum;

            }
            System.out.println("\n sum of n natural number is :: "+sum);
        }
    }
