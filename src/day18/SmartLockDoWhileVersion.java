package day18;

import java.util.Scanner;

public class SmartLockDoWhileVersion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock Knock! Tell me password");

        String password;

        do {
            System.out.println("Whats the password?");
            password = scan.next();
        }

        while (!password.equals("B15"));

        System.out.println("Door is open");
    }
}
