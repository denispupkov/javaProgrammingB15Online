package day17;

import java.util.Scanner;

public class NameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "";
        String name2 = "";

        System.out.println("Enter your name");
        name = scan.next();

        name2 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();  //first option

        System.out.println(name2);  // first option

        name2 = (name.charAt(0) + "").toUpperCase(); //second option using "" TO MAKE CHAR AS A STRING!!!
        name2 += name.substring(1).toLowerCase(); // second option
        System.out.println(name2); // second option


    }
}
