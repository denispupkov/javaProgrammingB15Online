package day15;

import java.util.Scanner;

public class HomeworkRepl8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String sentence = "";
        System.out.println("Enter the sentence");
        sentence = scan.nextLine();

        System.out.println(sentence.trim());
        if (sentence.indexOf(" ") == sentence.lastIndexOf(" ")) {

            System.out.println("You have entered two words");
        } else {

            System.out.println("You have entered more than two words");
        }


        System.out.println("First Index of the space is " + sentence.indexOf(" "));
        System.out.println("Last Index of the space is also " + sentence.lastIndexOf(" "));


    }
}
