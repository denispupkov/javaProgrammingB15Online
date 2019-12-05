package day19;

import java.util.Scanner;

public class ShazamDoWhileLoop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String password ="Shazam";
        String yourEnter="";

        do {
            System.out.println("Tell me your Password");
            yourEnter=scan.next();
        }
        while (!yourEnter.equalsIgnoreCase(password));

        System.out.println("You are now SUPER HERO!");

    }
}
