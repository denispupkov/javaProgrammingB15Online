package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed, my friend?");
        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit");
        int speedLimit = scan.nextInt();

        if (currentSpeed>=speedLimit) {

            System.out.println("Pull Over! ");
            System.out.println("Get ticket by the police");
            System.out.println("taken away some points on your licence");
            System.out.println("Go to court");
        }
        System.out.println("The end. Move on!");
    }

}
