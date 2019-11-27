package day06;

import java.util.Scanner;

public class CapturingMultipleWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String name =scan.nextLine();

        System.out.println("Which city you live in including state?");
        String city =scan.nextLine();

        System.out.println("What is your address");
        String address =scan.nextLine();

        System.out.println("You have entered name "+name+" you live in "+city+" and your address is "+address);

    }
}
