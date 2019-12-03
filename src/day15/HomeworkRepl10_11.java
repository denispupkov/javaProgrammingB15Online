package day15;

import java.util.Scanner;

public class HomeworkRepl10_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = "";

        System.out.println("Enter sentence with 3 words");
        sentence = scan.nextLine();

        System.out.println("the second word of sentence is "
                + sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" ")));

        System.out.println("the first word of sentence is "
                + sentence.substring(0, sentence.indexOf(" ")));

        System.out.println("the third word of sentence is "
                + sentence.substring(sentence.lastIndexOf(" ")));

    }
}
