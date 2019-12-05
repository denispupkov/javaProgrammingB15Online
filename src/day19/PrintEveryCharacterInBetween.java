package day19;

import java.util.Scanner;

public class PrintEveryCharacterInBetween {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char firstChar;
        char lastChar;
        String pickFirstCharacter = " ";
        String pickSecondCharacter = " ";

        System.out.println("Enter your first and last Character ");
        pickFirstCharacter = scan.next();
        pickSecondCharacter = scan.next();

        firstChar = pickFirstCharacter.charAt(0);
        lastChar = pickSecondCharacter.charAt(0);

        if (firstChar < lastChar) {

            for (char i = firstChar; i <= lastChar; i++) {

                System.out.print(i+" ");
            }
        } else if (firstChar > lastChar) {

            for (char i = firstChar; i >= lastChar; i--) {

                System.out.print(i+" ");

            }

        }

    }
}

