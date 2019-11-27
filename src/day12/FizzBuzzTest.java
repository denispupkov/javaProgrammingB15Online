package day12;

import java.util.Scanner;

public class FizzBuzzTest {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        int number=3;
        System.out.println("Enter your number");
        number=scan.nextInt();


        if (number%5==0) {

            System.out.println("it is fizz number");
        }
        else if (number%3==0) {

            System.out.println("its Buzz number");
        }

        else if (number%5==number%3) {

            System.out.println("Its FizzBuzz number");
        }
    }
}
