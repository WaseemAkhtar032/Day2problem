package whileloop;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        int number = 0, sum=0;
        System.out.println("\n Enter the number:: \n ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num > 0 ) {
            sum = num + sum;
            num--;

        }
        System.out.println("\n sum of n natural number is :: "+sum);
        }
    }

