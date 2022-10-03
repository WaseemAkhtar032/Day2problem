package whileloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter the number :: \n");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num != 0) {

                int remainder = num % 10;
                rev = rev * 10 + remainder;
                num = num / 10 ;
            }
            System.out.println("The reverse of the given number is: " + rev);

        }
        }
