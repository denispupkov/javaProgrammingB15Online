package day16;

import java.util.Scanner;

public class GiveMe5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // System.out.println("Give me FIVE!");
        //int userNumber = scan.nextInt();

//        if (userNumber!=5) {
//            System.out.println("HEY YOU DID NOT GIVE ME 5");
//        }
//        System.out.println("end of the program!");
//
        int number = 0;

        while (number != 5) {

            System.out.println("Give me FIVE");
            number = scan.nextInt();
        }

        System.out.println("End OF PROGRAM!");

    }
}
