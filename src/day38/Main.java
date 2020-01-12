package day38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.substring(s.length() - 2).equalsIgnoreCase("PM") && // 12PM
                s.substring(0, 2).equals("12")) {
            System.out.println(s.substring(0, s.length() - 2));
        } else if (s.substring(s.length() - 2).equalsIgnoreCase("AM") && //12AM
                s.substring(0, 2).equals("12")) {
            System.out.print(s.substring(0, 2).replaceFirst("12", "00"));
            System.out.print(s.substring(2, s.length() - 2));
        } else if (s.substring(s.length() - 2).equalsIgnoreCase("AM") && //00AM-11AM
                !s.substring(0, 2).equals("12")) {
            System.out.print(s.substring(0, s.length() - 2));
        } else if (s.substring(s.length() - 2).equalsIgnoreCase("PM") && //
                !s.substring(0, 2).equals("12") && s.substring(2, 3).equals(":")) {
            int time = Integer.parseInt(s.substring(0, 2));
            time = time + 12;
            System.out.print(time);
            System.out.print(s.substring(2, s.length() - 2));
        } else if (s.substring(s.length() - 2).equalsIgnoreCase("PM") &&
                s.substring(0, 2).equals("11")) {
            int time = Integer.parseInt(s.substring(0, 2));
            time = time + 12;
            System.out.print(time);
            System.out.print(s.substring(2, s.length() - 2));
        } else if (s.substring(s.length() - 2).equalsIgnoreCase("PM") &&
                s.substring(0, 2).equals("10")) {
            int time = Integer.parseInt(s.substring(0, 2));
            time = time + 12;
            System.out.print(time);
            System.out.print(s.substring(2, s.length() - 2));


        } else if (s.substring(s.length() - 2).equalsIgnoreCase("PM") && //
                !s.substring(0, 2).equals("12") && !s.substring(2, 3).equals(":")) {
            int time = Integer.parseInt(s.substring(0, 1));
            time = time + 12;
            System.out.print(time);
            System.out.print(s.substring(1, s.length() - 2));
        }
    }
}
