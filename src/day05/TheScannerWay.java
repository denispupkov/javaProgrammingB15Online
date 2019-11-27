package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name:");

        String name = scan.next();

        System.out.println("Your name is: "+name);

        System.out.println("What is your birth year:");

        int birthYear = scan.nextInt();

        System.out.println("You was born in: "+birthYear);

        System.out.println("You are "+(2019-birthYear)+" years old");

        System.out.println("What is your height:");

        double height = scan.nextDouble();

        System.out.println("Your height is :"+height);




    }
}
