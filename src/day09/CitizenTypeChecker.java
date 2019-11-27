package day09;

import java.util.Scanner;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String citizenType;
        int age;

        System.out.println("enter your age");
        age=scan.nextInt();


        if (age>=65) {
            citizenType="Senior";
        }
        else {
            citizenType="Not-Senior";
        }
        System.out.println("your status: "+citizenType);
    }
}
