package day22;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        System.out.print("Enter ");
        String word = scan.next();

        for (int i=0; i<=word.length()-3; i++) {

            if (word.substring(i, i+3).equals("dog")) {
                countOfDogs++;
            }

            else if (word.substring(i, i+3).equals("cat")) {
                countOfCats++;
            }

        }
        System.out.print("Cats "+countOfCats+" Dogs "+countOfDogs);
        if (countOfCats==countOfDogs) {
            System.out.print(true);
        }
        else
            System.out.print(false);
    }
}




