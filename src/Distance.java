import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {

                int x,y,x1=0,y1=0;

                double dis;

                Scanner sc=new Scanner(System.in);

                System.out.println("enter x point");

                x=sc.nextInt();

                System.out.println("enter y point");

                y=sc.nextInt();

                dis = Math.sqrt((x*x)+(y*y));

                System.out.println("distancebetween" + " ("+x+","+y+")"+" ("+x1+","+y1+") is ::\t " +dis);

            }

        }
