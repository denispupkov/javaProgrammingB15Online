package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String name =scan.next(); //it will only captured first word separated by space
        String anotherWord=scan.next(); // it picks second word in case if it exist
        System.out.println("enter your age");
        int age = scan.nextInt();

        System.out.println("you have entered first name as "+name);
        System.out.println("you have eneterd last name as "+anotherWord);
        System.out.println("You have entered age "+age);

    }
}
