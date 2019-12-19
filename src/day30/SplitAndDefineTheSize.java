package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        String sentence = "I love Java Java Java";

        String[] wordsArray = sentence.split(" ", 2);

        String model = wordsArray[1];

        if (model.length() == 20) {

            System.out.println("model = " + model);
        }

        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        System.out.println("wordsArray size = " + wordsArray.length);

    }
}
