package day15;

import java.util.Scanner;

public class HomeworkRepl12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word with at least two characters");
        String sentence = scan.nextLine();

        System.out.println("You have entered " + sentence);
        String firstLetter = sentence.substring(sentence.indexOf(sentence.charAt(0)), sentence.indexOf(sentence.charAt(1)));
        String lastLetter = sentence.substring(sentence.length() - 1);
        String newWord = sentence.replace(firstLetter, lastLetter);
        String newWord2 = sentence.replace(lastLetter, firstLetter);

        String newWord3 = sentence.substring(sentence.indexOf(sentence.charAt(1)), sentence.indexOf(sentence.length() - 1));

        System.out.println("first letter is " + firstLetter);
        System.out.println("last letter is " + lastLetter);
        System.out.println("middle word is " + newWord3);


        //System.out.println("This is the new word "+newWord);
        //System.out.println("This is the new word "+newWord2);


    }


}
