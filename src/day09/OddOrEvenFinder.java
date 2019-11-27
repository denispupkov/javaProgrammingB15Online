package day09;

import java.util.Scanner;

public class OddOrEvenFinder {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the number");
        int number=scan.nextInt();

        if (number%2==0) {
            System.out.println("Your number is even");
        }
            else {
                System.out.println("Your number is odd");
            }
        }

    }

