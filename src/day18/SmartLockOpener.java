package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String enterPassword = "";
        String correctPassword = "B15";

        System.out.println("Knock Knock! Tell me password");
        enterPassword = scan.next();

        while (!enterPassword.equals(correctPassword)) {

            System.out.println("Wrong Password, try again");

            enterPassword = scan.next();
        }
        System.out.println("OPEN SESAME!!!");

    }
}


