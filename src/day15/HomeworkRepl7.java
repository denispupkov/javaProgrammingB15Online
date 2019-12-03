package day15;

import java.util.Scanner;

public class HomeworkRepl7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = "";

        System.out.println("Enter valid email address");
        email = scan.nextLine();

        System.out.println("Part 1: " + email.substring(0, email.indexOf("@")));
        System.out.println("Part 2: " + email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")));
        System.out.println("Part 3: " + email.substring(email.lastIndexOf(".") + 1, email.length()));

    }
}
