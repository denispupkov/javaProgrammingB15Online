package day41;

import java.util.Scanner;

public class Repl160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            int cnt = 0;
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[i].equals(words[j])) {
                    cnt++;

                }
            }
            if (cnt == 0) {
                System.out.println(words[i]);
            }
        }

    }
}



