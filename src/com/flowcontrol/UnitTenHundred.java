package com.flowcontrol;
import java.util.Scanner;
public class UnitTenHundred {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);


            int hund = 0;
            int ten = 0;
            int unit = 0;

            System.out.print("Enter a number:: ");
            int number = input.nextInt();
            if (number > 100 && number < 1000) {
                System.out.println("you enterd 3_digit number\n");
                unit = number % 10;
                System.out.printf("\nOnes place digit: " + unit);
                ten = ((number / 10) % 10);
                System.out.printf("\nTens place digit: " + ten);
                hund = ((number / 100) % 10);
                System.out.printf("Hundreds place digit: " + hund);
            }
            else if(number>10 && number <100) {
                System.out.println("you enterd 2-digit number \n");
                unit = number % 10;
                System.out.printf("\nOnes place digit: " + unit);
                ten = ((number / 10) % 10);
                System.out.printf("\nTens place digit: " + ten);
            }

            else if(number<10) {
                System.out.println("you enterd single digit number \n");
                unit = number % 10;
                System.out.printf("\nOnes place digit: " + unit);
            }
            else
            System.out.println("\nInvalid number ");
        }
    }
