package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String firstName = scan.next();

        System.out.println("You have entered: " +firstName);

        System.out.println("Enter your age: ");

        int yourAge = scan.nextInt();

        System.out.println("you age is: "+yourAge);


    }
}
