package day12;

import java.util.Scanner;

public class WakeUpTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int month =11;

        System.out.println("Enter number of month");
        month=scan.nextInt();

    if (month>12 || month<1) {
        System.out.println("Invalid month");
    }
    else if (month>=3 && month<=5) {

            System.out.println("Its Spring");
        }
    else if (month>=6 && month<=8) {

        System.out.println("its Summer");
    }

    else if (month>=9 && month<=11) {

        System.out.println("Its Fall");
    }

    else {
        System.out.println("its winter");
    }


    }
}
