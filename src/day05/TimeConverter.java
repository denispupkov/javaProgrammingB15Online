package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int minutesInDay = 1440;

        System.out.println("How many days do you usually take for vacation?");
        int days = scan.nextInt();
        System.out.println("Do you think it isn't enough?");
        System.out.println("Your "+days+" days have "+days*minutesInDay+" minutes to enjoy your vacation");
        System.out.println("Now it sounds more impressive, right?");



    }
}
