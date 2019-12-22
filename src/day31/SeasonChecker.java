package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        String season = "Winter";

        decideSeasonAction(season);
    }

    public static void decideSeasonAction(String season) {

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


    }
}