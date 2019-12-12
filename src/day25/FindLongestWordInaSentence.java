package day25;

import java.util.Arrays;

public class FindLongestWordInaSentence {

    public static void main(String[] args) {


        String sentence = "We All Love Java Coding intensively all the time";

        String[] cuttedSentence = sentence.split(" ");

        System.out.println("Arrays.toString(cuttedSentence = " + Arrays.toString(cuttedSentence));

        String longestWord = cuttedSentence[0];

        int maxCharCount = 0;

        for (String currentWord : cuttedSentence) {

            //System.out.println("currentWord = " + currentWord);
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }

        }
        System.out.println("longestWord = " + longestWord);
    }


}

