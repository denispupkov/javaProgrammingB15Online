package day11;

import java.util.Scanner;

public class SringEqualityMultibranch {

    public static void main(String[] args) {


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

        System.out.println("-------------------------------------------");


        if (myString.equals("Java")) {

            System.out.println("Correct Word");
        }


        else if (myString.equals("Cava")) {

            System.out.println("Pumpkin");

        }

    else {
            System.out.println("Not Java not Pumpkin");
        }


    }
}


