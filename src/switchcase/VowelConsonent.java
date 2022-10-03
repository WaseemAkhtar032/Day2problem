package switchcase;

import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {
        System.out.println("enter the key ");
        Scanner key = new Scanner(System.in);
        String sc = key.nextLine();

        switch(sc){

            case "a":
                System.out.println("is vowel \t"+sc);
                break;
            case "e" :
                System.out.println("is vowel\t"+sc);
                break;
            case "i" :
                System.out.println("is vowel\t"+sc);
                break;
            case "o" :
                System.out.println("is vowel\t"+sc);
                break;
            case "u" :
                System.out.println("is vowel\t"+sc);
                break;
            default :
                System.out.println("is conconent\t"+sc);

        }
    }
}
