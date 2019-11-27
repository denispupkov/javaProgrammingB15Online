package day12;

import java.util.Scanner;
public class SeasonCheckCase {
public static void main(String[]args){


    Scanner scan=new Scanner(System.in);

    String season="";

    System.out.println("enter your season");
    season=scan.next();

    if (season.equalsIgnoreCase("Spring")) {


        System.out.println("Hiking, Alerg, Cool weather, Easter");
    }
    else if (season.equalsIgnoreCase("Summer")) {

        System.out.println("Pool, Swimming, Beach");
    }
    else if (season.equalsIgnoreCase("Fall")) {

        System.out.println("Barbeque, Halloween, Code");
    }

    else if (season.equalsIgnoreCase("Winter")) {

        System.out.println("CODE, Ski, Snowman");
    }
    else
    System.out.println("Wrong season!");
}
}