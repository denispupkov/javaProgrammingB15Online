package day10;

import java.util.Scanner;

public class SeasonAction {

    public static void main(String[] args) {

        String season = "Fall";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your favorite season");

        season=scan.next();
        switch (season) {


            case "Spring": {

                System.out.println("your season is " + season);
                System.out.println("Easter, Blossom");
                break;
            }
            case "Summer": {
                System.out.println("your season is " + season);
                System.out.println("Swim, BBQ, Vacation");
                break;
            }

            case "Fall": {
                System.out.println("your season is " + season);
                System.out.println("Halloween, Black Friday");
                break;
            }
            case "Winter": {
                System.out.println("your season is " + season);
                System.out.println("Snow, Christmas, Happy New Year");
                break;
            }
                default:
                    System.out.println("Typo");

        }
        //System.out.println("your season is "+season);


    }
}