package day11;

import java.util.Scanner;

public class ScoreChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;

        System.out.println("Enter Score");
        score = scan.nextInt();


        if (score < 0 || score > 100) {

            System.out.println("Invalid score");

        } else if (score == 100) {
            System.out.println("Perfect Score");
        } else if (score >= 70 && score <= 100) {
            System.out.println("You have passed");
        }
        else if (score >= 40 && score <= 70) {
            System.out.println("Little bit more study will let you pass");}

        else if (score >= 30 && score <= 40) {
            System.out.println("attend additional classes");}

            else if (score<30  && score>=20) {
                System.out.println("come to my office");

        }
        else {
            System.out.println("You have failed");
        }


    }
}