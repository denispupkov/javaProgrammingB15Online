package day19;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 0;
        int end = 0;

        System.out.println("enter starting and ending speed");
        start = scan.nextInt();
        end = scan.nextInt();

        for (int i = start; i <= end; i++) {

            System.out.print(i + ", ");

        }

    }

}

