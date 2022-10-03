package com.flowcontrol;
import java.util.Scanner;
public class SingleDigitNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int s = in.nextInt();
        if(s == 1){
            System.out.println("ONE");
        }
        else if (s==2){

            System.out.println("TWO");
        }
        else if (s==3){

            System.out.println("THREE");
        }
        else if (s==4){

            System.out.println("FOUR");
        }
        else if (s==5){

            System.out.println("FIVE");
        }
        else if (s==6){

            System.out.println("SIX");
        }
        else if (s==7){

            System.out.println("SEVEN");
        }
        else if (s==8){

            System.out.println("EIGHT");
        }
        else if (s==9){

            System.out.println("NINE");
        }

        else {

            System.out.println("invalid choice \n ");
        }
    }
}
