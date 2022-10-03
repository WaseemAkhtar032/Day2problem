import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        System.out.println("ENTER DATE AND MONTH \n");
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int month = sc2.nextInt();
        if (month == 3 && day >= 20 && day <= 31){
            System.out.println("TRUE");
        }


        else if (month == 4 && day >=  1 && day <= 30){

            System.out.println("TRUE");
        }
        else if (month == 5 && day >=  1 && day <= 31){

            System.out.println("TRUE");
        }
        else if (month == 6 && day >=  1 && day <= 20){

            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");


    }
}
