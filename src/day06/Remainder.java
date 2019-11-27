package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        // 5 divided by 2 is 2 and remainder is 1

        System.out.println(5%2);
        System.out.println(99%10);
        System.out.println(100%10);


        int minutes;
        int hour=60;


        System.out.println("enter how many minutes did you spend on shopping?");
        minutes =scan.nextInt();
        int result=minutes/hour;
        int minutesRemained=minutes%hour;
        System.out.println("you spent "+result+" hours and "+minutesRemained+" minutes");

    }
}
