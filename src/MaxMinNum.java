import java.util.Scanner;
public class MaxMinNum {
    public static void main(String[] args) {


                System.out.println("Enter the values of a,b,c");
                Scanner obj = new Scanner(System.in);
                int a = obj.nextInt();
                int b = obj.nextInt();
                int c = obj.nextInt();
                int d1, d2, d3, d4;
                d1 = a + b * c;
                d2 = c + a / b;
                d3 = a % b + c;
                d4 = a * b + c;
                System.out.println("Total Value of d1= " + d1);
                System.out.println("Total Value of d2= " + d2);
                System.out.println("Total Value of d3= " + d3);
                System.out.println("Total Value of d4= " + d4);
                if (d1 > d2 && d1 > d3 && d1 > d4) {
                    System.out.println("maximum value is=" + d1);
                } else if (d1 < d2 && d1 < d3 && d1 < d4) {
                    System.out.println("minimum value is=" + d1);
                }
                if (d2 > d1 && d2 > d3 && d2 > d4) {
                    System.out.println("maximum value is=" + d2);
                } else if (d2 < d1 && d2 < d3 && d2 < d4) {
                    System.out.println("minimum value is=" + d2);
                }
                if (d3 > d1 && d3 > d2 && d3 > d4) {
                    System.out.println("maximum value is=" + d3);
                } else if (d3 < d1 && d3 < d2 && d3 < d4) {
                    System.out.println("minimum value is=" + d3);
                }
                if (d4 > d1 && d4 > d2 && d4 > d3) {
                    System.out.println("maximum value is=" + d4);
                } else if (d4 < d1 && d4 < d2 && d4 < d3) {
                    System.out.println("minimum value is=" + d4);
                }
            }
        }
