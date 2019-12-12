package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence = "I Love Java";


        String[] allWords = sentence.split(" "); //method splits one string with spaces to array string

        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));
        System.out.println("how many words/sections do I have in this sentence? " + allWords.length);
        System.out.println("last word in this sentence is " + allWords[allWords.length - 1]);


        String sentence2 = "Everything is Awesome!!!";

        String[] splittedSentence = sentence2.split("e");

        System.out.println("Arrays.toString(splittedSentence = " + Arrays.toString(splittedSentence));


    }
}
