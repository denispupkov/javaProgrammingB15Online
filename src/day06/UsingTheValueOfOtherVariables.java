package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;

        System.out.println("My favorite number is "+myFavoriteNumber+" and your favorite number is "+yourFavoriteNumber+"" +
                " it is the same number as mine");

        yourFavoriteNumber=100;

        System.out.println("My favorite number is "+myFavoriteNumber+" and your favorite number is "+yourFavoriteNumber);


    }
}
