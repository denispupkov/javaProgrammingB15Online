package day16;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = "";
        String word2 = "";


        System.out.println("Enter 4 character word");
        word1 = scan.next();
        // adding "" eliminates calculation of chart numbers
        word2 = word1.charAt(3) + "" + word1.charAt(2) + "" + word1.charAt(1) + "" + word1.charAt(0); // version 1 to eliminate sum
        word2 += word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0); // version 2 to eliminate sum

        System.out.println(word2);


        String msg = "Hello ";

        //msg= msg+"World";
        msg += "World";  //shorter way

        System.out.println("msg = " + msg);

    }
}
