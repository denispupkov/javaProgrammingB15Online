package day16;

import java.util.Scanner;

public class SecondWordGetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = "";
        String word2 = "";
        String word3 = "";
        String sentence = "You Understand Java";

        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        //System.out.println(sentence.substring(2,6));
        word2 = sentence.substring(firstSpaceIndex + 1, lastSpaceIndex);
        System.out.println("word2 = " + word2);

        word1 = sentence.substring(0, firstSpaceIndex);
        System.out.println("word1 = " + word1);

        word3 = sentence.substring(sentence.lastIndexOf(" ") + 1);
        System.out.println("word3 = " + word3);

    }
}
