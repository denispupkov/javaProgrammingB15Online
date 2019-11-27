package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name =scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age?");
        int age =scan.nextInt();
        //String age =scan.nextLine(); //for number we can use String to store it as a string

        scan.nextLine(); // USE IT WITHOUT VARIABLE TO CAPTURE "ENTER" KEYBOARD FROM PREVIOUS COMMAND
        System.out.println("Your age is "+age);

        System.out.println("What is your address?");
        String address =scan.nextLine();
        System.out.println("Your address is "+address);



    }
}
