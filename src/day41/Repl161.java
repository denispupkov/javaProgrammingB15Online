package day41;

import java.util.Scanner;

public class Repl161 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int number) {
        //WRITE YOUR CODE HERE
        int num = number;
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }
        if (reverse == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

