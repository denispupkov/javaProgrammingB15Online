package day15;

import java.util.Scanner;

public class HomeworkRepl2 {

    public static void main(String[] args) {

        String word ="";

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word with at least 3 characters");
        word=scan.next();

        System.out.println(word.charAt(0));

        System.out.println(word.charAt(word.length()-1));

        System.out.println(word.charAt(word.length()/2-1));





    }
}
