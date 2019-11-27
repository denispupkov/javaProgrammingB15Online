package day11;

import java.util.Scanner;

public class CheckingTwoStrings {

public static void main(String[]args){

String myString="";
String yourString="";

    Scanner scan = new Scanner(System.in);

    System.out.println("enter my word");
    myString=scan.next();

    System.out.println("enter your word");
    yourString=scan.next();

    if (myString.equals(yourString)) {

        System.out.println("correct word!!!");
    }
    else {

        System.out.println("Java");
    }

}
}
